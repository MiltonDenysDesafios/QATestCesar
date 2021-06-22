package page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;

public class BasePage {
	
	protected static List<Map<String, String>> dataTableInfo;
	public static WebDriver driver;
	protected static List<WebElement> listOfElements;
	protected static String url;


	public static void openHomePage(DataTable data) {
		dataTableInfo = data.asMaps(String.class, String.class);
		url = dataTableInfo.get(0).get("URL");

		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"E:\\workplace_eclipse\\TestQA\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.quit();

		} catch (Exception e) {

		}
	}

	public static void preencher(String xpath, String value) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.sendKeys(value);

	}
	
	public static void scroolDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	
	public static void returnValue(String xpath) {

		String value = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(value);
	}
	
	public static void hoverAction(String xpath) {
	WebElement ele = driver.findElement(By.xpath(xpath));

	//Creating object of an Actions class
	Actions action = new Actions(driver);
	//Performing the mouse hover action on the target element.
	action.moveToElement(ele).perform();
}
	public static void click(String xpath) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();

	}
}
