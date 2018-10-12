package com.game.io.file.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author WilliamAhmed
 * @since 12/10/2018
 */
public class PropertiesLoaderImpl {

	private static PropertiesLoaderImpl instance;
	private Properties properties;

	private PropertiesLoaderImpl() {
	}

	public static PropertiesLoaderImpl getInstance() {
		if(null == instance) {
			instance = new PropertiesLoaderImpl();
		}

		return instance;
	}

	public String getProperty(final String propertiesFileName, final String key) {

		if(null == properties) {
			loadPropertiesFile(propertiesFileName);
		}

		return this.properties.getProperty(key);
	}

	private void loadPropertiesFile(final String filename) {
		String propertiesFileNameWithExtension = String.format("%s.properties", filename);

		try {

			InputStream inputStream = PropertiesLoaderImpl.class.getClassLoader().getResourceAsStream(propertiesFileNameWithExtension);

			this.properties = new Properties();
			this.properties.load(inputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
