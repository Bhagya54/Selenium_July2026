package Day7_ReadProperties_Log4J;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties_Simple {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/properties/config.properties");
		Properties config = new Properties();
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));
		System.out.println(config.getProperty("testsiteurl"));
		
		

	}

}
