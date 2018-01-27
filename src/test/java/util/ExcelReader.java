package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static Object[][] readXLSXFile(String fileName) throws IOException {

		String[][] value = null;
		try {
			String filepath = System.getProperty("user.dir") + "//src//test//java//testdata//" + fileName;
			FileInputStream inputStream = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

			XSSFSheet sheet = workbook.getSheetAt(0);

			int numberOfRows = sheet.getPhysicalNumberOfRows();

			int numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();

			value = new String[numberOfRows][numberOfColumns];

			for (int i = 0; i < numberOfRows; i++) {
				XSSFRow row = sheet.getRow(i); // bring row
				for (int j = 0; j < numberOfColumns; j++) {
					XSSFCell cell = row.getCell(j);
					if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						value[i][j] = "" + cell.getStringCellValue();
					} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						value[i][j] = "" + cell.getNumericCellValue();

					}
				} // for(c)
			} // for(r)
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;
	}

	public static boolean isTestExecutable(String testCaseName) throws IOException {
		String filepath = System.getProperty("user.dir") + "//src//test//java//testdata//TestcaseExecutor.xlsx";
		FileInputStream inputStream = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

			XSSFSheet sheet = workbook.getSheetAt(0);

			int numberOfRows = sheet.getPhysicalNumberOfRows();

			int numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			for (int i = 0; i < numberOfRows; i++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				if (value.equals(testCaseName)) {
					cell = row.getCell(1);
					String value2 = cell.getStringCellValue();
					if (value2.equalsIgnoreCase("yes")) {
						return true;
					}
				}
			}
			return false;
			
		}

		 

		

	}
