import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;import pageObject.SearchHotelObject;
import pageObject.SelectHotelObject;
import pageObject.loginObject;
public class Login{
   	 public static Select dropDown;
	 public static WebElement location;
	 public static WebElement hotel;
	 public static WebElement roomType;
	 public static WebElement roomNO;
	 public static WebElement adultPerRoom;
	 public static WebElement childrenPerRoom;
    @Test
	public void loginPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Giridharan Rangasami\\eclipse-workspace\\PageObjectModel\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement userName = driver.findElement(By.id("username"));
		 * userName.sendKeys("GiridharanR"); WebElement passWord =
		 * driver.findElement(By.id("password")); passWord.sendKeys("nava_Rosebud8");
		 * WebElement login = driver.findElement(By.id("login"));
		 * login.sendKeys("login");
		 */ /*
		 * driver.findElement(By.id("username")).sendKeys("GiridharanR");
		 * driver.findElement(By.id("password")).sendKeys("nava_Rosebud8");
		 * driver.findElement(By.id("login")).click();
		 *//*
		 * loginObject loginObject = new loginObject();
		 * loginObject.userName(driver).sendKeys("GiridharanR");
		 * loginObject.passWord(driver).sendKeys("password");
		 * loginObject.login(driver).click();
		 */PageFactory.initElements(driver, loginObject.class);
		loginObject.userName.sendKeys("GiridharanR");
		loginObject.passWord.sendKeys("nava_Rosebud8");
		loginObject.login.click();
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
		  dropDown = new Select(roomNO);
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
	      PageFactory.initElements(driver, SelectHotelObject.class);
			SelectHotelObject.radio.click();
			SelectHotelObject.continuebtn.click();

	}

}
