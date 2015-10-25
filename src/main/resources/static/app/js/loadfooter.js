var loadfooter = {
		init : function(footer) {
			var html = "<div class='col-sm-2'>Follow us on</div> <div class='col-sm-8'><div class='collapse navbar-collapse navbar-ex1-collapse'><ul class='nav navbar-nav'>";
			jQuery.each(footer, function(key, value) {
				var values = value.split(",");
				html = html + "<li><a href="+ values[1] + ">" + values[0] + "</a></li>";
			});
			html = html + "</ul>";
			jQuery("#footer" ).append(html)
								.append("<div class='col-sm-2'>Copyright &copy; 2012 Classmate Academy</div>");
			
		}
}