package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelObject {

	public static WebElement location(WebDriver driver) {

		return driver.findElement(By.xpath("//select[@name= 'location'][@class='search_combobox']"));

	}

	public static WebElement hotel(WebDriver driver) {

		return driver.findElement(By.xpath("//select[@name= 'hotels'][@class='search_combobox']"));
	}
	
	public static WebElement roomType(WebDriver driver) {
		
		return driver.findElement(By.xpath("//select[@name= 'room_type'][@class='search_combobox']"));
	}

	public static WebElement roomNo(WebDriver driver) {

		return driver.findElement(By.xpath("//select[@name= 'room_type'][@class='search_combobox']"));
	}

	public static WebElement element(WebDriver driver) {

		return driver.findElement(By.xpath("//select[@name= 'room_nos'][@class='search_combobox']"));

	}

	public static WebElement datePick(WebDriver  driver) {

		return driver.findElement(By.xpath("//input[@value = '10/06/2020']"));
	}

	public static WebElement datePickOut(WebDriver driver) {

		return driver.findElement(By.id("datepick_in"));
	}

	public static WebElement date(WebDriver  driver) {

		return driver.findElement(By.xpath("//input[@value = '11/06/2020']"));
	}
	
	public static WebElement adultPerRoom(WebDriver driver) {

		return driver.findElement(By.id("datepick_out"));
	}
	

	public static WebElement childrenPerRoom(WebDriver driver) {

		return driver.findElement(By.xpath("//select[@name = 'adult_room']"));

	}

	public static WebElement search(WebDriver driver) {
    	return driver.findElement(By.id("Submit"));
    }
    @FindBy(xpath="//select[@name= 'location'][@class='search_combobox']")
	public static WebElement location;
	@FindBy(xpath="//select[@name= 'hotels'][@class='search_combobox']")
	public static WebElement hotel;
	@FindBy(xpath="//select[@name= 'room_type'][@class='search_combobox']")
	public static WebElement roomType;
	@FindBy(xpath= "//select[@name= 'room_nos'][@class='search_combobox']")
	public static WebElement roomNo;
	@FindBy(xpath="//select[@name= 'room_nos'][@class='search_combobox']")
	public static WebElement element;
	@FindBy(xpath="//input[@value = '11/06/2020']")
	public static WebElement datePick;
	@FindBy(id="datepick_in")
	public static WebElement datePickOut;
	@FindBy(xpath="//input[@value = '11/06/2020']")
	public static WebElement date;
	@FindBy(id ="datepick_out")
	public static WebElement adultPerRoom;
	@FindBy(xpath="//select[@name = 'adult_room']")
	public static WebElement childrenPerRoom;
	@FindBy(xpath="//select[@name = 'child_room']")
	public static WebElement search;
	

	}

