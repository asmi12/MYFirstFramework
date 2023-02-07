import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class getAttributePractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asmit\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
	        WebElement searchTextBox = driver.findElement(By.className("gLFyf"));
	        // retrieving html attribute value using getAttribute() method
	        String titleValue = searchTextBox.getAttribute("title");
	        System.out.println("Value of title attribute: " + titleValue);
	        String autocompleteValue = searchTextBox.getAttribute("autocomplete");
	        System.out.println("Value of autocomplete attribute: " + autocompleteValue);
	        // Retrieving value of attribute which does not exist
	        String nonExistingAttributeValue = searchTextBox.getAttribute("nonExistingAttribute");
	        System.out.println("Value of nonExistingAttribute attribute: " + nonExistingAttributeValue);
	}

}
