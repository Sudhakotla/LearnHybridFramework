package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationData 
{
	Properties pro;
	
	
	public ConfigurationData()
	{
		
		File srs = new File("./ConfigurationFiles./config.properties");
		
		try {
			
				FileInputStream fis = new FileInputStream(srs);
				pro = new Properties();
				pro.load(fis);
								
			
		} catch (Exception e) 
		
	    {
			
			System.out.println("Exception while executing script :"+e.getMessage());
			
		}
		
	}
	     
	
	public String getApplicationurl()
	{
		return pro.getProperty("URL");
	}

}
