package zposmrt;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import GenericUtility.ExcelUtility;
import GenericUtility.IPathConstants;

public class ReadJSONDataFromExcel {
public static void main(String[] args) throws Throwable {
	// To fetch particular json value from the cell of excel
	
	
FileInputStream inputStream=new FileInputStream(IPathConstants.excelPath);
Workbook workbook= WorkbookFactory.create(inputStream);
Sheet sheet = workbook.getSheet("Sheet3");
int lastRow = sheet.getLastRowNum();

String name="";
String email="";
int startRow=1;
int startCell=0;
for(int i=startRow;i<=lastRow;i++)
{
	try {
String jsonString = sheet.getRow(i).getCell(startCell).getStringCellValue();
ObjectMapper objectMapper=new ObjectMapper();
JsonNode jsonNode = objectMapper.readTree(jsonString);
 name = jsonNode.get("name").asText();
 email = jsonNode.get("email").asText();
System.out.println("Row "+(i+1));
//System.out.println("Name: "+name);
System.out.println("Email: "+email);
System.out.println();
	}
		catch (Exception e) {
			System.out.println("Row "+(i+1));
			System.out.println("Name: "+name);
			System.out.println();
		}
	
}
workbook.close();
inputStream.close();

}
		}