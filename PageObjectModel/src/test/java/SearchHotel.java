import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageObject.SearchHotelObject;

public class SearchHotel {
   public Select dropDown;
    
	@Test
	public void searchHotel() {
		System.setProperty
		("webdriver.chrome.driver","C:\\Users\\Giridharan Rangasami\\"
				+ "eclipse-workspace\\PageObjectModel\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		      
		WebElement location = driver.findElement(By.xpath("//select[@name= 'location'][@class='search_combobox']"));
	    location.click();
		dropDown= new Select(location);
		dropDown.selectByVisibleText("New York");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@name= 'hotels'][@class='search_combobox']"));
		hotel.click();
		dropDown = new Select(hotel);
		dropDown.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@name= 'room_type'][@class='search_combobox']"));
		roomType.click();
		dropDown = new Select(roomType);
		dropDown.selectByVisibleText("Double");
		
		WebElement roomNo = driver.findElement(By.xpath("//select[@name= 'room_nos'][@class='search_combobox']"));
		roomNo.click();
		dropDown = new Select(roomNo);
		dropDown.selectByVisibleText("4 - Four");
		
		WebElement element =  driver.findElement(By.xpath("//input[@value = '10/06/2020']"));
		element.clear();
		
		WebElement datePick = driver.findElement(By.id("datepick_in"));
		datePick.sendKeys("12/06/2020");
		
		WebElement datePickOut = driver.findElement(By.xpath("//input[@value = '11/06/2020']"));
		datePickOut.clear();
		
		WebElement date = driver.findElement(By.id("datepick_out"));
		date.sendKeys("14/06/2020");
		
		WebElement adultPerRoom = driver.findElement(By.xpath("//select[@name = 'adult_room']"));
		adultPerRoom.click();
		dropDown= new Select(adultPerRoom);
		dropDown.selectByVisibleText("4 - Four");
		
		WebElement childrenPerRoom = driver.findElement(By.xpath("//select[@name = 'adult_room']"));
		childrenPerRoom.click();
		dropDown = new Select(childrenPerRoom);
		dropDown.selectByVisibleText("2 - Two");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		SearchHotelObject searchHotelObject = new SearchHotelObject();
		SearchHotelObject.location(driver).click();
		dropDown= new Select(location);
		dropDown.selectByVisibleText("New York");
		SearchHotelObject.hotel(driver).click();
		dropDown = new Select(hotel);
		dropDown.selectByVisibleText("Hotel Sunshine");
		SearchHotelObject.roomType(driver).click();
		dropDown = new Select(roomType);
		dropDown.selectByVisibleText("Double");
		SearchHotelObject.roomNo(driver);
		dropDown = new Select(roomNo);
		dropDown.selectByVisibleText("4 - Four");
		SearchHotelObject.element(driver).clear();
		SearchHotelObject.datePick(driver).sendKeys("12/06/2020");;
		SearchHotelObject.datePickOut(driver).clear();
		SearchHotelObject.date(driver).sendKeys("14/06/2020");
		SearchHotelObject.adultPerRoom(driver).click();
		dropDown= new Select(adultPerRoom);
		dropDown.selectByVisibleText("4 - Four");
		SearchHotelObject.childrenPerRoom(driver).click();
		dropDown = new Select(childrenPerRoom);
		dropDown.selectByVisibleText("2 - Two");
        SearchHotelObject.search(driver).click();
        
      PageFactory.initElements(driver, SearchHotelObject.class);
      SearchHotelObject.location.click();
      dropDown= new Select(location);
	  dropDown.selectByVisibleText("New York");
	  SearchHotelObject.hotel.click();
	  dropDown = new Select(hotel);
	  dropDown.selectByVisibleText("Hotel Sunshine");
	  SearchHotelObject.roomType.click();
	  dropDown = new Select(roomType);
	  dropDown.selectByVisibleText("Double");
	  SearchHotelObject.roomNo.click();;
	  dropDown = new Select(roomNo);
	  dropDown.selectByVisibleText("4 - Four");
	  SearchHotelObject.element.clear();
	  SearchHotelObject.datePick(driver).sendKeys("12/06/2020");;
	  SearchHotelObject.datePickOut.clear();
	  SearchHotelObject.date.sendKeys("14/06/2020");
	  SearchHotelObject.adultPerRoom.click();
	  dropDown= new Select(adultPerRoom);
	  dropDown.selectByVisibleText("4 - Four");
	  SearchHotelObject.childrenPerRoom.click();
	  dropDown = new Select(childrenPerRoom);
	  dropDown.selectByVisibleText("2 - Two");
      SearchHotelObject.search.click();
   }
 }
