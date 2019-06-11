/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tMenu: {
			menuId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../t/menu/save?_' + $.now(),
		    	param: vm.tMenu,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
