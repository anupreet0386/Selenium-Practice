import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ebaytest {
	@Test
	public void ebaytesting() throws InterruptedException{
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("http://ebay.com");
		Thread.sleep(2000);
		driver2.findElement(By.cssSelector("#gh-ac")).sendKeys("bikes");
		driver2.findElement(By.cssSelector("#gh-btn")).click();
		Thread.sleep(5000);
		
		List<WebElement> bikes= null;
		for (int m =0; m<50; m++){
			((JavascriptExecutor) driver2).executeScript("window.scrollBy(0,350)", "");
			bikes = driver2.findElements(By.cssSelector(".vip"));
		}
		
		Thread.sleep(5000);
		driver2.manage().window().maximize();
		System.out.println(bikes.size());
		for (int i=0; i<bikes.size(); i++){
			WebElement e = bikes.get(i);
			System.out.println(e.getText());
		
		}
		
	}

}
