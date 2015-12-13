var test = {
	init : function(footer) {
		loadfooter.init(footer);
		jQuery.each(homeProperties, function(key, value) {
			jQuery("#" + key).append(value);
		});
		
	}
	
$('#NEW_USER').click(function(){
    // window.location.href='registration.html';
     window.open('registration.html', '_blank');
                         })
      $("#TEST_SERIES").click(function(){
         $("#TESTSERIES").show();
         $("#ONLINETESTDIV").hide();

      });
        $("#ONLINE_TESTS").click(function(){
         $("#ONLINETESTDIV").show();
         $("#TESTSERIES").hide();

      });

}