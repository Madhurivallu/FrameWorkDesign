package ApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadStringint {

	public static void main(String[] args) throws Exception {
		File file = new File ("C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\ReadStr-int.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		
		XSSFSheet Sheet = Workbook.getSheet("Login");
		Row rownum = Sheet.getRow(0);
		int rc = Sheet.getLastRowNum();
		int cc = rownum.getLastCellNum();
		System.out.println(rc+" "+cc);
		for (int i = 0; i<rc; i++) {
			
			if(Workbook.getSheet("Login").getRow(i).getCell(1).getCellType()==CellType.NUMERIC.NUMERIC)
			{
				int celldata = (int)Workbook.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
				String username = Sheet.getRow(i).getCell(0).getStringCellValue();
				String password = String.valueOf(celldata);
				System.out.println(username+" "+password);
				Sheet.getRow(i).createCell(2).setCellValue("pass");
			}
		}
		
		
			Workbook.close();
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\ReadStr-int.xlsx");
			
			
			fis.close();
		 
		}

	
}
	


