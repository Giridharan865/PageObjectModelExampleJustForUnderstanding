import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.SelectHotelObject;
public class SelectHotel {

	@Test
	public void selectHotel() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Giridharan Rangasami\\eclipse-workspace\\"
				+ "PageObjectModel\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * WebElement radio = driver.findElement(By.id("radiobutton_0")); radio.click();
		 * WebElement continuebtn = driver.findElement(By.id("continue"));
		 * continuebtn.click();
		 * 
		 * SelectHotelObject selectHotelObject = new SelectHotelObject();
		 * SelectHotelObject.radio(driver).click();
		 * SelectHotelObject.continuebtn(driver).click();
		 */
		PageFactory.initElements(driver, SelectHotelObject.class);
		SelectHotelObject.radio.click();
		SelectHotelObject.continuebtn.click();
   }
}
