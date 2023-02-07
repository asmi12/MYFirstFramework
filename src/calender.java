import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.qatechhub.com/date-picker/");
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();

//		 driver.findElement(By.id("ui-datepicker-title"));
		while (!driver.findElement(By.className("ui-datepicker-title")).getText().contains("March 2025")) {
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
		}
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
		int count = driver.findElements(By.cssSelector(".ui-state-default")).size();

		for (int i = 0; i < count; i++) {
			String dates1 = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if (dates1.equalsIgnoreCase("30")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}

	}

}
