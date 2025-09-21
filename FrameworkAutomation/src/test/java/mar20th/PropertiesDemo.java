package mar20th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("D:\\MyEWS\\FrameworkAutomation\\Properties\\config.properties");
		Properties pro = new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
	}

}
