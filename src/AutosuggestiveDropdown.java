import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://test.qatechhub.com/auto-complete/");
		 driver.findElement(By.cssSelector("#tags")).sendKeys("j");
		 Thread.sleep(2000);
		List<WebElement> dropdownList= driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(int i=0; i<dropdownList.size();i++)
		{
		   WebElement getCount=dropdownList.get(i);
		   String text= getCount.getText();
		   System.out.println(text);
		   if(text.equalsIgnoreCase("javascript"))
		   {
			   getCount.click();
			   break;
		   }
		   
		}
	}

}
