package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
//	public static void main(String[] args) throws IOException
//	{
	public String[][] ReadExcelFile(String fileName) throws IOException
	{
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		int cellnum = sheet.getRow(0).getLastCellNum();
		String data[][] = new String[rownum][cellnum];
		for (int i = 1; i <= rownum; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellnum; j++) 
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.print(value+" ");
			}
			System.out.println();
		}
		wBook.close();
		return data;
	}
}
