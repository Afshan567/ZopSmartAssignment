package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String readData(String sheetName,int rowNum,int cellNum) throws Throwable {
	FileInputStream fl=new FileInputStream(IPathConstants.excelPath);
	Workbook wb = WorkbookFactory.create(fl);
	Sheet sh = wb.getSheet(sheetName);
	return sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
	
}

}
