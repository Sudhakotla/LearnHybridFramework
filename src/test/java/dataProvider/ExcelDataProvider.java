package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider
{

	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		
		try {
			
			File srs = new File("C:\\Users\\welcome\\workspace\\com.facebook.hybrid\\ApplicationTestData\\AppicationData.xlsx");

			FileInputStream fis = new FileInputStream(srs);
			
			wb = new  XSSFWorkbook(fis);
			

			
					
		} catch (Exception e) 
		{
			
			System.out.println("Exception is :"+e.getMessage());
			
			
		}
		
				
	}
	
	public String getData(int sheetIndex,int row,int col) throws Exception
	{
		
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
		wb.close();

		return data;
		
		
	}
	
	public String getData(String sheetName,int row,int col)
	{
		
		String data = wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
		
		return data;
		
		
	}
	
	
}
