/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tMenu: {
			menuId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../t/menu/info?_' + $.now(),
		    	param: vm.tMenu.menuId,
		    	success: function(data) {
		    		vm.tMenu = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../t/menu/update?_' + $.now(),
		    	param: vm.tMenu,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})