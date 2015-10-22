CREATE DATABASE OnlineTest;

GRANT ALL ON OnlineTest.* TO 'root'@'localhost';

CREATE TABLE OnlineTest.users (
     uid MEDIUMINT NOT NULL AUTO_INCREMENT,
     userid VARCHAR(250) NOT NULL,
	 password VARCHAR(1024),
     PRIMARY KEY (uid)
) ENGINE=MyISAM;

INSERT INTO users (userid, password) VALUES ('admin','Admin#2113')