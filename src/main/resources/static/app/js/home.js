var home = {
		init : function(footer, homeProperties, resultProperties) {
			loadfooter.init(footer);
			jQuery.each(homeProperties, function(key, value) {
					jQuery("#" + key ).append(value);
			});
			jQuery.each(resultProperties, function(key, value) {
				jQuery("#main_results").append("<p>" + value + "</p>");
			console.log(key);
		});
		}
		
}