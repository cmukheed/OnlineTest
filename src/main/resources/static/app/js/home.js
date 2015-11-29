var home = {
	init : function(footer, homeProperties, resultProperties, tweetsProperties) {
		loadfooter.init(footer);
		jQuery.each(homeProperties, function(key, value) {
			jQuery("#" + key).append(value);
		});
		jQuery.each(resultProperties, function(key, value) {
			jQuery("#main_results").append("<p>" + value + "</p>");
			console.log(key);
		});
		jQuery.each(tweetsProperties, function(key, value) {
			jQuery("#main_tweets").append("<p>" + value + "</p>");
			console.log(key);
		});
	}

}