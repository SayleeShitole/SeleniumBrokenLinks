package Saylee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	
	
	public static void main(String[] args) throws IOException 
	{
		String Path="C:\\Users\\user\\Documents\\test.xlsx";
		
		File file = new File(Path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		XSSFSheet sb=wb.getSheetAt(0);
		
		String data00 = sb.getRow(0).getCell(0).getStringCellValue();
		
		String data01=sb.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data00);
		System.out.println(data01);
	

		try
		{
			
			XSSFRow row=sb.getRow(0);
			
			if(row==null)
			{
				sb.createRow(0);
			}
			
			row.createCell(6).setCellValue("Hello Excel");
			row.createCell(3).setCellValue("kjkjkjkj");
			
			sb.createRow(0).createCell(8).setCellValue("data");
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			
			
		}
		catch(Exception e)
		{
		
			System.out.println("We are unable to get data");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("My data updated successfully");
	}

}
