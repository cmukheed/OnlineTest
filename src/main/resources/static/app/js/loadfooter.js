var loadfooter = {
		init : function(footer) {
			var html = "<div class='col-sm-4'><ul class = 'nav navbar-nav'>" +
					"<li><p id= 'FOLLOW_US'>Follow Us</p></li>" +
					"<li><a href='#' target='_blank'><i class='fa fa-facebook'></i></a></li>" +
					"<li><a class='fa fa-twitter social-icon' href='#' target='_blank'></a></li>" +
					"<li><a class='fa fa-linkedin social-icon' href='#' target='_blank'></a></li>" +
					"<li><a class='fa fa-google-plus social-icon' href='#' target='_blank'></a></li></ul></div> <div class='col-sm-6'><div class='collapse navbar-collapse navbar-ex1-collapse'><ul class='nav navbar-nav'>";
			jQuery.each(footer, function(key, value) {
				var values = value.split(",");
				html = html + "<li><a href="+ values[1] + ">" + values[0] + "</a></li>";
			});
			html = html + "</ul>";
			jQuery("#footer" ).append(html)
								.append("<div class='col-sm-2'>Copyright &copy; 2012 Classmate Academy</div>");
			
		}
}