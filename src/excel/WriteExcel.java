package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook();//xlsx files, HSSF-xls
		XSSFSheet sh = wb.createSheet("TestSheet");
		XSSFRow row = sh.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("TestData");
		cell = row.createCell(1);
		cell.setCellValue("1234");
		row = sh.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue(1234);
		try {
			
				wb.write(new FileOutputStream("output\\Excel\\Test.xlsx"));
		
		}catch(FileNotFoundException e1){
			
			//e.printStackTrace();
			wb.write(new FileOutputStream("Test.xlsx"));
		}catch(IOException e1) {
			
			e1.printStackTrace();
			
		}
		try {
			wb.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
		
		}
		
	}
		
		
		
}

