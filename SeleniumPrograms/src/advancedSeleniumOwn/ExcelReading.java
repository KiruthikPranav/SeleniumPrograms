package advancedSeleniumOwn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadExcel{
	//int = 21;
	Sheet sheet;
	Workbook workBook = null;
	
	void readXlsxFile(String excelFilePath) throws IOException {
		
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		
		workBook = new XSSFWorkbook(inputStream);
		sheet=(XSSFSheet)workBook.getSheetAt(0);
		
		Iterator rowItr = sheet.iterator();
		
		while(rowItr.hasNext()){
			XSSFRow rows = (XSSFRow)rowItr.next();
		
			Iterator cellItr=rows.cellIterator();
			
			while(cellItr.hasNext()){
				XSSFCell cell =(XSSFCell)cellItr.next();
				
				switch (cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case BLANK:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				case _NONE:
					break;
				default:
					break;
				}
				System.out.print(" || "+"\t"); 
			}
			System.out.println();
		}
	}
	
	void readXlsFile(String excelFilePath) throws IOException {
		FileInputStream inputStream = new FileInputStream(excelFilePath);

			workBook = new HSSFWorkbook(inputStream);
			//workBook = WorkbookFactory.create(inputStream);
			//sheet=workBook.getSheetAt(0);
			sheet=(HSSFSheet)workBook.getSheetAt(0);
			
			Iterator rowItr = sheet.iterator();
			
			while(rowItr.hasNext()) {
				HSSFRow rows = (HSSFRow)rowItr.next();
				
				Iterator cellItr=rows.cellIterator();
				
				while(cellItr.hasNext())
				{
					HSSFCell cell =(HSSFCell)cellItr.next();
					
					switch (cell.getCellType())
					{
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					case BLANK:
						break;
					case ERROR:
						break;
					case FORMULA:
						break;
					case _NONE:
						break;
					default:
						break;
					}
					System.out.print(" || "+"\t"); 
				}
				System.out.println();
		}	
	}
}

public class ExcelReading {
	public static void main(String[] args) throws IOException {
		//Giving FilePath Location in String
		String excelFilePath = "I:\\Selenium\\1 Selenium Class\\xlsDemoFile.xls";
		
		//Using substring finding extension. So that it works for .xlsx and .xls file
		String fileExtensionName = excelFilePath.substring(excelFilePath.indexOf("."));
		
		ReadExcel re = new ReadExcel();
		if (fileExtensionName.equals(".xlsx")) {
			re.readXlsxFile(excelFilePath);	//Calling xlsx method
		} 
		else if (fileExtensionName.equals(".xls")) {
			re.readXlsFile(excelFilePath);	//Calling xls method
		}
		else {
			System.out.println("Check File Extension");
		}
	}
}

/*
 * // Check condition if the file is xlsx file 
 * 
 * if(fileExtensionName.equals(".xlsx")) {
 
  // If it is xlsx file then create object of XSSFWorkbook class 
 	workBook = new XSSFWorkbook(inputStream); 
  	sheet = (XSSFSheet) workBook.getSheetAt(0);//XSSFSheet sheet=workBook.getSheetAt("Sheet1"); 
 // Using For Loop
  	int rows = sheet.getLastRowNum(); 
  	int column = sheet.getRow(1).getLastCellNum();
 
 	for (int i = 0; i <= rows; i++)
 	{
 	 XSSFRow row = (XSSFRow) sheet.getRow(i);
 
  	for (int j = 0; j < column; j++) 
  	{
  	 XSSFCell cell = row.getCell(j);
  
 * switch (cell.getCellType()) {
 *  case STRING:
 * System.out.print(cell.getStringCellValue()); break; 
 * case NUMERIC:
 * System.out.print(cell.getNumericCellValue()); break; 
 * case BOOLEAN:
 * System.out.print(cell.getBooleanCellValue()); break; 
 * case BLANK: break; 
 * case ERROR: break; 
 * case FORMULA: break; 
 * case _NONE: break; 
 * default: break;
 *  }
 * System.out.print(" || "+"\t"); } System.out.println(); } }
 * 
 * // Check condition if the file is xls file else if
 * (fileExtensionName.equals(".xls")) {
 * 
 * // If it is xls file then create object of HSSFWorkbook class workBook = new
 * HSSFWorkbook(inputStream); sheet = (HSSFSheet) workBook.getSheetAt(0);//
 * XSSFSheet sheet=workBook.getSheetAt("Sheet1"); // Using For Loop
 * 
 * int rows = sheet.getLastRowNum(); int column =
 * sheet.getRow(1).getLastCellNum();
 * 
 * for (int i = 0; i <= rows; i++) { HSSFRow row = (HSSFRow) sheet.getRow(i);
 * 
 * for (int j = 0; j < column; j++) { HSSFCell cell = row.getCell(j);
 * 
 * switch (cell.getCellType()) { case STRING:
 * System.out.print(cell.getStringCellValue()); break; case NUMERIC:
 * System.out.print(cell.getNumericCellValue()); break; case BOOLEAN:
 * System.out.print(cell.getBooleanCellValue()); break; case BLANK: break; case
 * ERROR: break; case FORMULA: break; case _NONE: break; default: break; }
 * System.out.print(" || "+"\t"); } System.out.println();
 * 
 * }
 * 
 * }
 */