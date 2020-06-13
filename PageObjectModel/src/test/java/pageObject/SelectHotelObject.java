package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelObject {

	public static WebElement radio(WebDriver driver){
		 return driver.findElement(By.id("radiobutton_0"));
	}	
		public static WebElement continuebtn(WebDriver driver){
			return driver.findElement(By.id("continue"));
		
	}
		@FindBy(id = "radiobutton_0")
		public static WebElement radio;
		@FindBy(id= "continue")
		public static WebElement continuebtn;
}
