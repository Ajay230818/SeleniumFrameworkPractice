package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datalibrary {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb =new XSSFWorkbook("./data/DataFile.xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		int lastRowNum = ws.getLastRowNum();
		
		short lastCellNum = ws.getRow(1).getLastCellNum();
		
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.print(CellValue+" ");
			}
			System.out.println();
			System.out.println("*******************************************************");
		}
		
		wb.close();
	}

}
