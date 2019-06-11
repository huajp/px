/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tUser: {
			userId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../t/user/info?_' + $.now(),
		    	param: vm.tUser.userId,
		    	success: function(data) {
		    		vm.tUser = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../t/user/update?_' + $.now(),
		    	param: vm.tUser,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})