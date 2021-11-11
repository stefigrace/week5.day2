package week5.day1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.ReadExcel;

public class CreateLead extends BaseClass {
	@Test(dataProvider="SendData")
	public void RunCreateLead(String company, String firstname, String lastname, String phone) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();		
}
	@DataProvider
	public String [][] SendData() throws IOException {
		
		ReadExcel re=new ReadExcel();
		String[][] readData = re.ReadData("CreateLead");
		return readData;
		
	}
}
