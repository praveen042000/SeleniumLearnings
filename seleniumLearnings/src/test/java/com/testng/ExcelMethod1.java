package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelMethod1 {

	WebDriver driver;

	@Test(dataProvider = "supplier")

	public void loginTest(String email, String password) {

		driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.cssSelector("a[title='My Account']"))).click().build().perform();

		act.moveToElement(driver.findElement(By.xpath("//a[text()='Login']"))).click().build().perform();

		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);

		driver.findElement(By.cssSelector("#input-password ")).sendKeys(password);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Assert.assertTrue(driver.getTitle().equals("My Account"));

	}

	@DataProvider(name = "supplier")

	public Object[][] dataSupplier() {

		String excelFilePath = "C:\\Users\\pmanoharan1\\eclipse-workspace\\seleniumLearnings\\src\\test\\java\\com\\testng\\Excel1.xlsx";

		File excelFile = new File(excelFilePath);

		FileInputStream fis = null;

		try {

			fis = new FileInputStream(excelFile);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		XSSFWorkbook workbook = null;

		try {

			workbook = new XSSFWorkbook(fis);

		} catch (IOException e) {

			e.printStackTrace();

		}

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getPhysicalNumberOfRows();

		System.out.println(rowCount);

		int colsCount = sheet.getRow(0).getLastCellNum();

		System.out.println(colsCount);

		Object[][] data = new Object[rowCount - 1][colsCount];

		for (int r = 0; r < rowCount - 1; r++) {

			XSSFRow row = sheet.getRow(r + 1);

			for (int c = 0; c < colsCount; c++) {

				XSSFCell cell = row.getCell(c);

				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:

					data[r][c] = cell.getStringCellValue();

					break;

				}

			}

		}

		return data;

	}

}