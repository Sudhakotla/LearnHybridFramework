package factory;

import dataProvider.ConfigurationData;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory
{
	
	public static ConfigurationData getConfig()
	{
		ConfigurationData config = new ConfigurationData();
		
		return config;
	}

	
	public static ExcelDataProvider getExcel()
	{
 
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
		
	}
	
	
}
