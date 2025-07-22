package Saylee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	String path="C:\\Users\\user\\Documents\\test.xlsx";
	
	
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	
	public String readData(int sheet_index,int row_num,int cell_num) throws IOException

	{
		file=new File(path);
		
		fis=new FileInputStream(file);
		
		wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheetAt(sheet_index);
		
		String data=sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
		
		return data;
	}
	
	public void writeData(int sheet_index,int row_num,int cell_num,String status) throws IOException
	{
		
		file=new File(path);
		
		fis=new FileInputStream(file);
		
		wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheetAt(sheet_index);
		
		sheet.getRow(row_num).createCell(cell_num).setCellValue(status);
		
		FileOutputStream fos=new FileOutputStream(file);
		
		wb.write(fos);
		
		wb.close();
	}
	
}
