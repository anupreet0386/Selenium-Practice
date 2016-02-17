
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * facebook login test 
 * 
 * 
 */

public class facebooktest {

	@Test
	public void loginfacebook() throws InterruptedException {

		String browser = "Mozilla";

		WebDriver driver = null;

		if (browser == "Mozilla") {
			driver = new FirefoxDriver();
		} else if (browser == "Chrome") {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JAVA software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("+1408913****");
		driver.findElement(By.cssSelector("#pass")).sendKeys("*********");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#u_0_x")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("._2dpb")).click();
		// driver.findElement(By.xpath("//span[@class='_2dpb']")).click();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> names =null;
		for (int m =0; m<50; m++){
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
		names=driver.findElements(By.cssSelector(".fsl.fwb.fcb"));
		}
		//List<WebElement> names=driver.findElements(By.cssSelector(".fsl.fwb.fcb"));
		System.out.println(names.size());
		for(int i=0; i<108; i++){
		WebElement e = names.get(i);
		
		System.out.println(e.getText());
		
		}

	}

}
