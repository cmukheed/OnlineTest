var home = {
	init : function(footer, homeProperties, resultProperties, tweetsProperties) {
		loadfooter.init(footer);
		jQuery.each(homeProperties, function(key, value) {
			jQuery("#" + key).append(value);
		});
		var ulResults = jQuery('<ul>');
		jQuery.each(resultProperties, function(key, value) {
			
			liDiv = '<li>'+ value + '</li>';
			ulResults.append(liDiv);
			jQuery("#main_results").append(ulResults);
			$('#main_results').easyTicker({
				direction: 'up',
				easing: 'easeInOutBack',
				speed: 'slow',
				interval: 2000,
				height: 'auto',
				visible: 2,
				mousePause: 1,
				controls: {
					up: '.up',
					down: '.down',
					toggle: '.toggle',
					stopText: 'Stop !!!'
				}
			}).data('easyTicker')
		});
		var ulTweets = jQuery('<ul>');
		jQuery.each(tweetsProperties, function(key, value) {
			liDiv = '<li>'+ value + '</li>';
			ulTweets.append(liDiv);
			jQuery("#main_tweets").append(ulTweets);
			$('#main_tweets').easyTicker({
				direction: 'up',
				easing: 'easeInOutBack',
				speed: 'slow',
				interval: 2000,
				height: 'auto',
				visible: 2,
				mousePause: 1,
				controls: {
					up: '.up',
					down: '.down',
					toggle: '.toggle',
					stopText: 'Stop !!!'
				}
			}).data('easyTicker')
		});
	}

}