package org.com.app.online.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	private static final String PROP_FILE = "config.properties";
	private Properties prop = null;

	private void initialize() {
		try {
			prop = new Properties();
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (inputStream != null) {
				prop.load(inputStream);
			}
		} catch (Exception e) {
			System.out.println("Failed to read from " + PROP_FILE + " file.");
		}
	}

	public String getProperty(String name) {
		if (prop == null)
			initialize();
		return (prop.getProperty(name));

	}
}