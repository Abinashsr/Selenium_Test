package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void mymain() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eabismr\\Desktop\\New folder\\ch83\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		//driver.get("https://www.guru99.com");
		driver.get("http://54.165.42.55:8082/webapp/welcome.jsp");
		driver.findElement(By.name("username")).sendKeys("AB1");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		driver.close();
	}

}
