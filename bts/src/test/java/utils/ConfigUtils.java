package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigUtils {
	public static Properties prop;
	
	public ConfigUtils() throws Throwable {
		File file=new File("src/test/resources/configurations/GlobalConfig.properties");
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
	}
	
	public String readConfigData(String key) throws Throwable {
		String value=prop.getProperty(key);
		return value;
		
	}
	
	public void writeConfigData() {
		
	}

}
