import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class removeTextWOClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		   WebElement searchTextBox = driver.findElement(By.className("gLFyf"));
		  searchTextBox.sendKeys("Selenoum");
		  searchTextBox.sendKeys(Keys.CONTROL+"a");
		  searchTextBox.sendKeys(Keys.DELETE);
		  searchTextBox.sendKeys("Selenoum Automation");
		   
	}

}
