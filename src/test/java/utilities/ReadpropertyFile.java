package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("C:\\Users\\s362\\OneDrive - Capgemini\\My_New_Workspace\\Zoho_Application_Project\\src\\test\\resources\\config.properties");
         Properties p=new Properties();
         p.load(fr);
         System.out.println(p.getProperty("browser"));
         System.out.println(p.getProperty("testurl"));
	}

}
