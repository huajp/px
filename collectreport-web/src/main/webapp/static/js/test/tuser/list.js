/**
 * js
 */

$(function () {
	initialPage();
	getGrid();
});

function initialPage() {
	$(window).resize(function() {
		$('#dataGrid').bootstrapTable('resetView', {height: $(window).height()-56});
	});
}

function getGrid() {
	$('#dataGrid').bootstrapTableEx({
		url: '../../t/user/list?_' + $.now(),
		height: $(window).height()-56,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
            {field : "userId", title : "", width : "100px"},
            {field : "orgId", title : "", width : "100px"},
            {field : "userName", title : "", width : "100px"},
            {field : "password", title : "", width : "100px"},
            {field : "email", title : "", width : "100px"},
            {field : "mobile", title : "", width : "100px"},
            {field : "status", title : "状态 0:禁用，1:正常", width : "100px"},
            {field : "remark", title : "", width : "100px"},
            {field : "createUserId", title : "", width : "100px"},
            {field : "createTime", title : "", width : "100px"},
            {field : "mendUserId", title : "", width : "100px"},
            {field : "mendTime", title : "", width : "100px"},
            {title : "操作", formatter : function(value, row, index) {
                    var _html = '';
                    if (hasPermission('t:user:edit')) {
                        _html += '<a href="javascript:;" onclick="vm.edit(\''+row.userId+'\')" title="编辑"><i class="fa fa-pencil"></i></a>';
                    }
                    if (hasPermission('t:user:remove')) {
                        _html += '<a href="javascript:;" onclick="vm.remove(false,\''+row.userId+'\')" title="删除"><i class="fa fa-trash-o"></i></a>';
                    }
                    return _html;
                }
            }
		]
	})
}

var vm = new Vue({
	el:'#dpLTE',
	data: {
		keyword: null
	},
	methods : {
		load: function() {
			$('#dataGrid').bootstrapTable('refresh');
		},
		save: function() {
			dialogOpen({
				title: '新增',
				url: 'test/tuser/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function(userId) {
            dialogOpen({
                title: '编辑',
                url: 'test/tuser/edit.html?_' + $.now(),
                width: '420px',
                height: '350px',
                success: function(iframeId){
                    top.frames[iframeId].vm.tUser.userId = userId;
                    top.frames[iframeId].vm.setForm();
                },
                yes: function(iframeId){
                    top.frames[iframeId].vm.acceptClick();
                }
            });
        },
        remove: function(batch, userId) {
            var ids = [];
            if (batch) {
                var ck = $('#dataGrid').bootstrapTable('getSelections');
                if (!checkedArray(ck)) {
                    return false;
                }
                $.each(ck, function(idx, item){
                    ids[idx] = item.userId;
                });
            } else {
                ids.push(userId);
            }
            $.RemoveForm({
                url: '../../t/user/remove?_' + $.now(),
                param: ids,
                success: function(data) {
                    vm.load();
                }
            });
        }
	}
})