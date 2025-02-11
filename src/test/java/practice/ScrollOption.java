package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Drivers\\edgedriver_win64");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-down.php");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(2000);
		driver.quit();
		
			
			
	

}
}