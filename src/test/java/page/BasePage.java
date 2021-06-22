package page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;

public class BasePage {
	
	protected static List<Map<String, String>> dataTableInfo;
	public static WebDriver driver;
	protected static List<WebElement> listOfElements;
	protected static String url;

	
	/**
	 * @author Milton_Denys
	 * @param url
	 * @return
	 */
	public static String retornaURL(String url){
		Map<String, String> urls = new HashMap<String, String>();
		urls.put("discourse", "https://www.discourse.org");
		urls.put("cesarSchool", "https://www.cesar.school");
		return urls.get(url.toLowerCase()).toString();
	}
	
	
	

	public static void openHomePage(DataTable data) {
		dataTableInfo = data.asMaps(String.class, String.class);
		url = dataTableInfo.get(0).get("URL");

		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"E:\\workplace_eclipse\\TestQA\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

	public static void clicar(String xpath) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.click();

	}
}
