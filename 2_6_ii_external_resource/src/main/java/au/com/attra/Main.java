package au.com.attra;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");

		Resource resource = new ClassPathResource("discount.properties");
		// Other type of resources can be initialized by,
		// Resource fileResource = new
		// FileSystemResource("C:/Users/balaji.vijayan/Downloads/banner.txt");
		
		//Resource urlResource = new UrlResource("");
		try {
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
			System.out.println(prop);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
