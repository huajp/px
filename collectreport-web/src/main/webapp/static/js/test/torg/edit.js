/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tOrg: {
			orgId: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../t/org/info?_' + $.now(),
		    	param: vm.tOrg.orgId,
		    	success: function(data) {
		    		vm.tOrg = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../t/org/update?_' + $.now(),
		    	param: vm.tOrg,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})