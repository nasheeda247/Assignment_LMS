package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("TestData.xls"));
		HSSFSheet sh = wb.getSheet("NegativeTest");
		HSSFRow row = sh.getRow(0);
		HSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		cell = row.createCell(8);
		cell.setCellValue("PASS");
		wb.write(new FileOutputStream("TestResults.xls"));

	}

}
