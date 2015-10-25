package org.com.app.online.util;

import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;

public class PropertyReader {
	private Properties prop = null;

	private void initialize(String fileName) {
		try {
			prop = new OrderedProperties();
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			if (inputStream != null) {
				prop.load(inputStream);
			}
		} catch (Exception e) {
			System.out.println("Failed to read from " + fileName + " file.");
		}
	}

	public String getProperty(String fileName, String name) {
		initialize(fileName);
		return (prop.getProperty(name));

	}

	public Hashtable<Object,Object> getProperties(String fileName) {
		initialize(fileName);
		return (prop);

	}
}