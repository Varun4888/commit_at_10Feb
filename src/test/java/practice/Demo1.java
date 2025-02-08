package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://blazedemo.com/");
		WebElement l1 = driver.findElement(By.xpath("(//select[@class='form-inline'])[1]"));
		
		Select s=new Select(l1);
		s.selectByIndex(3);   //Portland
		Thread.sleep(2000);
        WebElement l2 = driver.findElement(By.xpath("(//select[@class='form-inline'])[2]"));
		
		Select s1=new Select(l2);
		s1.selectByIndex(3);   //Berlin
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn btn-small'])[4]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Set<String> window = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<>(window);
		driver.switchTo().window(ar.get(1));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();
		
}
}
