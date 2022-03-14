package ApachePoi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class XlsxWriteTest {

		public static void main(String[] args) throws Exception {
			
			XSSFWorkbook Workbook = new XSSFWorkbook();
			
			XSSFSheet Sheet = Workbook.createSheet("Bank1Sheet");
			
			Sheet.createRow(0);
			Sheet.getRow(0).createCell(0).setCellValue("Account name");
			Sheet.getRow(0).createCell(1).setCellValue("Account number");
			
			Sheet.createRow(1);
			Sheet.getRow(1).createCell(0).setCellValue("Madhuri");
			Sheet.getRow(1).createCell(1).setCellValue("0568944555793");
			
			File file = new File("C:\\Users\\Asus\\eclipse-workspace\\FrameWorkDesign\\ExcelSheets\\WriteTest1.xlsx");
			FileOutputStream fos = new FileOutputStream(file);
			Workbook.write(fos);
			Workbook.close();
			
			
			
			

		}

	}



