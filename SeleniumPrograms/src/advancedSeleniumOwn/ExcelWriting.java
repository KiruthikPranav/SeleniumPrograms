package advancedSeleniumOwn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WritingExcel{
	
	public void WriteInXlsx() throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Sheet1");
		
		Object data[][] = {

				{ "EmpNo", "Name", "Job" }, 
				{ 101, "Kiruthik", "Java" }, 
				{ 102, "Pranav", "Testing" },
				{ 103, "KiruthikPranav", "Sql" } 
				};
		
		int row  = data.length;		//rows
		int cell = data[0].length;	//Column
		
		for(int r=0;r<row;r++) {
			XSSFRow rows = sheet.createRow(r);
			for(int c=0;c<cell;c++) {
				XSSFCell cells = rows.createCell(c);
				Object value = data[r][c];
				
				if(value instanceof String)
					cells.setCellValue((String) value);
				if(value instanceof Integer)
					cells.setCellValue((Integer) value);
				if(value instanceof Boolean)
					cells.setCellValue((Boolean) value);
		
			}
		}
		
		String filepath = "I:\\Selenium\\1 Selenium Class\\Employee.xlsx";	//File Format should in .xlsx
		
		File file = new File(filepath);
		boolean exist = file.exists();
		if (exist == false) {
			FileOutputStream outputStream = new FileOutputStream(filepath);
			workBook.write(outputStream);
			outputStream.close();
			System.out.println(".Xlsx File Created");
		}
		else
			System.out.println(".Xlsx File is Already Exist");
		
		workBook.close();
	}
	
	public void WriteInXls() throws IOException {
		HSSFWorkbook workBook = new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet("Sheet1");
		
		Object data[][] = {

				{ "EmpNo", "Name", "Job" }, 
				{ 101, "Kiruthik", "Java" }, 
				{ 102, "Pranav", "Testing" },
				{ 103, "KiruthikPranav", "Sql" } 
				};
		
		int row = data.length;		//rows
		int cell = data[0].length;	//Column
		
		for(int r=0;r<row;r++) {
			HSSFRow rows = sheet.createRow(r);
			for(int c=0;c<cell;c++) {
				HSSFCell cells = rows.createCell(c);
				Object value = data[r][c];
				
				if(value instanceof String)
					cells.setCellValue((String) value);
				if(value instanceof Integer)
					cells.setCellValue((Integer) value);
				if(value instanceof Boolean)
					cells.setCellValue((Boolean) value);
		
			}
		}

		String filepath = "I:\\Selenium\\1 Selenium Class\\employee.xls";	//File Format should in .xls
		
		File file = new File(filepath);
		boolean exist = file.exists();
		if (exist == false) {
			FileOutputStream outputStream = new FileOutputStream(filepath);
			workBook.write(outputStream);
			outputStream.close();
			System.out.println(".Xls File Created");
		}
		else
			System.out.println(".Xls File is Already Exist");
		
		workBook.close();
	}
}

public class ExcelWriting {
	public static void main(String[] args) throws IOException {
		WritingExcel e = new WritingExcel();
		e.WriteInXlsx();
		e.WriteInXls();
	}
}
