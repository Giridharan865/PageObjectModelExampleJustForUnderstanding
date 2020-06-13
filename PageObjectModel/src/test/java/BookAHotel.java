import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookAHotel {

	public void bookAHotel() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Giridharan Rangasami\\eclipse-workspace\\PageObjectModel\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("(//input[@class = 'reg_input' ])[1]")).sendKeys("Giridharan");
		driver.findElement(By.xpath("(//input[@class = 'reg_input' ])[2]")).sendKeys("Rangaswami");
		driver.findElement(By.xpath("//textarea[@class = 'txtarea' ]")).sendKeys("Vibash & Nithish is my Bro's ");
		driver.findElement(By.xpath("(//input[@class = 'reg_input' ])[3]")).sendKeys("0123456789529812");
		driver.findElement(By.xpath("//select[@class = 'select_combobox' ]")).click();
		driver.findElement(By.xpath("//select[@class = 'select_combobox' ]")).click();
		Select cardType = new Select(driver.findElement(By.xpath("//select[@class = 'select_combobox' ]")));
		cardType.selectByVisibleText("Master Card");
		driver.findElement(By.id("cc_exp_month")).click();
		Select monthExpiry = new Select(driver.findElement(By.id("cc_exp_month")));
		monthExpiry.selectByValue("12");
		driver.findElement(By.id("cc_exp_year")).click();
		Select yearExpiry = new Select(driver.findElement(By.xpath("//select[@name = 'cc_exp_year']"
				                                              + "[@id ='cc_exp_year'][@class='select_combobox2']")));
		yearExpiry.selectByVisibleText("2020");
		driver.findElement(By.xpath("//input[@name = 'cc_cvv'][@type ='text'][@class='reg_input']")).sendKeys("1432");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type ='button'][@name ='book_now'][@class ='reg_button']")).click();
		
	}
}
