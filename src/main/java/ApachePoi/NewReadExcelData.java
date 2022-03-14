package ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewReadExcelData {

	public static void main(String[] args) throws Exception {
		
		String ExcelFilepath = "C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\NewreadExcelSheet.xlsx";
		FileInputStream inputstream = new FileInputStream(ExcelFilepath);
		
		XSSFWorkbook Wb = new XSSFWorkbook(inputstream);
		XSSFSheet St = Wb.getSheetAt(0);
		
		///Using for loop statement
		
		int rows = St.getLastRowNum();
		int cls = St.getRow(1).getLastCellNum();
		System.out.println(rows+" ||  "+cls);
		
		for (int r = 0; r<=rows ; r++) {
			
			XSSFRow row = St.getRow(r);
			
			for (int c = 0; c <cls; c++) {
				
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				//case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				}
				//System.out.println(username+" || "+password);
				}
				
				System.out.println();
			}
			
		}
		
		
		

	}


