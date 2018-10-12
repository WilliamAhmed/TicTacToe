package com.game.io.file.properties;

/**
 * @author WilliamAhmed
 * @since 12/10/2018
 */
public interface PropertiesLoader {

	static String getProperty(final String propertiesFileName, final String key) {
		return PropertiesLoaderImpl.getInstance().getProperty(propertiesFileName, key);
	}

	static int getPropertyAsInteger(final String propertiesFileName, final String key) {
		return Integer.parseInt(PropertiesLoaderImpl.getInstance().getProperty(propertiesFileName, key));
	}


}
