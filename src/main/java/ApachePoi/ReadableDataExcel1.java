package ApachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadableDataExcel1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\Dummy.xlsx");
		
		Workbook Workbook1 = WorkbookFactory.create(fi);
		
		Sheet Sheet1 = Workbook1.getSheet("Login");
		
		Row rownum = Sheet1.getRow(0);
		
		int rc = Sheet1.getLastRowNum();
		
		int cc = rownum.getLastCellNum();
		
		System.out.println(rc+"   "+cc);
		
		for (int i = 1; i <=rc; i++) {
			
			String username = Sheet1.getRow(i).getCell(0).getStringCellValue();
			String password = Sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
			Sheet1.getRow(i).createCell(2).setCellValue("pass");
			}
		
		fi.close();
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\Dummy.xlsx");
		Workbook1.write(fo);
		fi.close();
		Workbook1.close();
		
		
		
		

	}

}
