package pageObject;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookAHotelObject {
	public static WebElement location;
     @Test
	public void locationplus() {
		SearchHotelObject.location.click();
	}
	
	public void location() {
		dropDown= new Select(location);
		  dropDown.selectByVisibleText("New York");
	}
	
	
}
