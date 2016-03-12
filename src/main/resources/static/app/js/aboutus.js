var aboutus = {
		init : function(footer, aboutProperties) {
			loadfooter.init(footer);
			jQuery.each(aboutProperties, function(key, value) {
				jQuery("#" + key).append(value);
			});
		}
		
}