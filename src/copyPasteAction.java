import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyPasteAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 WebElement copyText= driver.findElement(By.name("name"));
		 copyText.sendKeys("Asmita");
		 copyText.sendKeys(Keys.CONTROL + "a");
		 copyText.sendKeys(Keys.CONTROL +"c");
		 WebElement PasteText= driver.findElement(By.name("email"));
		 PasteText.sendKeys(Keys.CONTROL+ "v");
	}

}
