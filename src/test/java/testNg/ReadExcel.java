package testNg;

import java.io.IOException;
import commonSteps.BaseClass;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		String value = BaseClass.readExcel("LoginDetails", "Sheet1", 1, 1);
        System.out.println("Cell Value: " + value);
	}

}
