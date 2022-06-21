package com.sgtesting.framework;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario_Runner2 {

	public static void main(String[] args) {
		executeTests();

	}
	
	private static void executeTests()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("C:\\CurrentWorkSpace\\ExampleMAr212022Batch\\Reflection-Automation\\DataFiles\\dataRunner_Scenario2.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(methodname+" ---> "+pkgclassname);
				
				Class clsObject=Class.forName(pkgclassname);
				Object obj=clsObject.getConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

