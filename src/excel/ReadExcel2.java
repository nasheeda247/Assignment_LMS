package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("TestData.xls"));
		HSSFSheet sh = wb.getSheet("NegativeTest");
//		int rows = sh.getPhysicalNumberOfRows();
//		for(int i=1;i<rows;i++) {
//			
//		HSSFRow row = sh.getRow(i);
//		HSSFCell cell = row.getCell(0);
//		System.out.println(cell.getStringCellValue());
//		}
		
		HSSFRow row = sh.getRow(0);
		int cells = row.getPhysicalNumberOfCells();
		for (int i=0;i<cells;i++)
		{
			HSSFCell cell = row.getCell(i);
			System.out.println(cell.getStringCellValue());
		}
			
						

     }
}
