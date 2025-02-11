package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadFile']")).
		sendKeys("C:\\Users\\aksha\\Downloads\\Sample_File.xlsx");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
		
		
	}

}
