package services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Record;


/**
 *
 * @author C5248417
 *
 */
public class ExcelProcessor
{

	ExcelProcessor ExcellProcessor= new ExcelProcessor();

	/**
	 *
	 * @param pathName-Where excel is Present
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	public static  LinkedHashMap readExcel(String pathName,String SheetName)
	{
		HashMap<Integer,Record> dataMap=new LinkedHashMap<Integer,Record>();

		try
		{

			FileInputStream file= new FileInputStream(new File(pathName));

			//Create A WorkBook Instance  Holding reference to  .xlsx file
			@SuppressWarnings("resource")
			XSSFWorkbook workbook= new XSSFWorkbook(file);

			//Get First Desired Sheet From Work Book
			XSSFSheet sheet=workbook.getSheet(SheetName);

			//Iterate Through Each Sheet one by One
			Iterator<Row> rowIterator =  sheet.iterator();
			while(rowIterator.hasNext())
			{
				//LinkedHashMap<String, Object> hmap= new LinkedHashMap<String,Object>();
				Record record=new Record();

				Row row=rowIterator.next();
				//For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				//This is Done to escape First Row of Excel Sheet.
				if(row.getRowNum()==0)
				{
					continue;
				}

				while (cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();
					//Check the cell type and format accordingly
					switch (cell.getColumnIndex())
					{
					case 1:
						record.setElementName(cell.getStringCellValue());
						break;

					case 2:
						record.setElementFindBy(cell.getStringCellValue());
						break;

					case 3:
						record.setElementFindByValue(cell.getStringCellValue());
						break;

					case 4:
						record.setColor(cell.getStringCellValue());
						break;

					case 5:
						record.setFontSize(cell.getStringCellValue());
						break;

					case 6:
						record.setFontFamily(cell.getStringCellValue());
						break;

					case 7:
						record.setPaddingTop(cell.getStringCellValue());
						break;

					case 8:
						record.setPaddingBottom(cell.getStringCellValue());
						break;
					case 9:
						record.setPaddingLeft(cell.getStringCellValue());
						break;

					case 10:
						record.setPaddingRight(cell.getStringCellValue());
						break;

					default:
						break;
					}
				}
				dataMap.put(row.getRowNum(),record);

			}

			file.close();
			//return (LinkedHashMap) dataMap;

		}

		catch(Exception e)
		{
			e.printStackTrace();
			//return (LinkedHashMap) dataMap;

		}

		return (LinkedHashMap) dataMap;



	}

}
