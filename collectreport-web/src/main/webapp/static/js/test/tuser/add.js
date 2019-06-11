/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tUser: {
			userId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../t/user/save?_' + $.now(),
		    	param: vm.tUser,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
