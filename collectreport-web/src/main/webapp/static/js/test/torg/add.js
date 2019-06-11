/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		tOrg: {
			orgId: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../t/org/save?_' + $.now(),
		    	param: vm.tOrg,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
