package com.inav.generic;

//Read the data from excel file,Data driven Framework
//Generic method

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static String getData(String sheet_name,int rn,int cn)
	{
		try
		{
			FileInputStream fis=new FileInputStream("./Data/Input.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Row r=wb.getSheet(sheet_name).getRow(rn);
			String Data=r.getCell(cn).toString();
			return Data;
			
		}
		catch(Exception e)
		{
			return "";
		}

	}
	public static int getRowcount(String sheet_name)
	{
		try
		{
			FileInputStream fis=new FileInputStream("./Data/Input.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int rc=wb.getSheet(sheet_name).getLastRowNum();
			return rc;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static int getcellcount(String sheet_name,int rn)
	{
		try
		{
			FileInputStream fis=new FileInputStream("./Data/Input.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int cn=wb.getSheet(sheet_name).getRow(rn).getLastCellNum();
			return cn;
		}
		catch(Exception e)
		{
			return -1;
		}

}
}
