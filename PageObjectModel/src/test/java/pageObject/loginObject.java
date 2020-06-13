package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginObject {
     /*
	 * public static WebElement userName(WebDriver driver) {
	 * 
	 *   return driver.findElement(By.id("username"));
	 * 
	 * }
	 * 
	 * public static WebElement passWord(WebDriver driver) {
	 * 
	 *     return driver.findElement(By.id("password"));
	 * 
	 * }
	 * 
	 * public static WebElement login(WebDriver driver) {
	 * 
	 *       return driver.findElement(By.id("login"));
	 * 
	 * }
	 */
  @FindBy(id="username")
  public static WebElement userName;
  @FindBy(id= "password")
  public static WebElement passWord;
  @FindBy(id= "login")
  public static WebElement login;
}
