package com.bitm.SeleniumOnlineProject.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.SeleniumOnlineProject.DTO.LoginDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;
	
	private static Sheet getSheet(int sheetNo) throws IOException
	{   
		//File file = new File("");
			
		File f= new File("src/main/java");
		File fs= new File(f,"data.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheetAt(sheetNo);
		return sheet;
	}
	
	//LoginTest
	public static List<LoginDTO> getLoginData() throws IOException
	{
	List<LoginDTO> logindata = new ArrayList<LoginDTO>();
	DataFormatter formatter = new DataFormatter();
	//Login
	Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
		
		
		LoginDTO login =new LoginDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
				
			case 0:
				login.setUsername(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 1:
				login.setPassword(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 2:
				login.setUsername(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
				login.setPassword(formatter.formatCellValue(cell));
				break;
		
			}
		}
		logindata.add(login);
		
	}
	close();
	return logindata;
	}
	
	
	
	private static void close() throws IOException {
		
		workbook.close();
		inputStream.close();
	}

		
		
}
