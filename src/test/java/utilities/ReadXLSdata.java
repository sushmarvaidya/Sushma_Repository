package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void getData(String excelSheetName) throws EncryptedDocumentException, IOException
	{
		File f=new File(System.getProperty("user.id")+"src\\test\\resources\\testdata\\testdata.xlsx");
		FileInputStream file=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sheetName=wb.getSheet(excelSheetName);
		int totalRows=sheetName.getLastRowNum();
		System.out.println(totalRows);
		Row rowcells=sheetName.getRow(0);
		int totalCols=rowcells.getLastCellNum();
		System.out.println(totalCols);
		DataFormatter format=new DataFormatter();
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalCols;j++) {
				//testData[i-1][j]=format
				
			}
		}
		
		
		
	}

}
