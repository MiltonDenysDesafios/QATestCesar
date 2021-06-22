package page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CesarSchoolPage extends BasePage{

	protected static List<WebElement> listOfElements;

	
	public static String comboHeaderMenu(String menuOption) {
		Map<String, String> xpaths = new HashMap<String, String>();
		xpaths.put("CESAR School ON", "//li[@id='menu-item-15713']");
		xpaths.put("SCHOOL", "//li[@id='menu-item-15376']");
		xpaths.put("Vestibular 2021.2", "//li[@id='menu-item-17904']");
		xpaths.put("GRADUAÇÃO", "//li[@id='menu-item-7611']");
		xpaths.put("PÓS-GRADUAÇÃO", "//li[@id='menu-item-7612']");
		xpaths.put("EXTENSÃO", "//li[@id='menu-item-7614']");
		xpaths.put("FORMAÇÃO EXECUTIVA", "//li[@id='menu-item-15614']");
		return xpaths.get(menuOption).toLowerCase().toString();
	}
	public static void clickHeaderButtons() {
		hoverAction(comboHeaderMenu(dataTableInfo.get(0).get("Menu")));
	}
			
	
	
	public static void getSecondTitle() {
		String xpath = "//h2[@class='entry-title']";
		WebElement list = driver.findElement(By.xpath(xpath));
		List<WebElement> rows_table = list.findElements(By.xpath(xpath));
		System.out.println(rows_table.get(2).getText());
		}
	
	public static void getPublishDate() {
		String xpath = "//time[@class='entry-date published']";
		WebElement list = driver.findElement(By.xpath(xpath));
		List<WebElement> rows_table = list.findElements(By.xpath(xpath));
		System.out.println(rows_table.get(2).getText());
	}
	public static void getTitlePost() {
		returnValue("//h1[@class=\"entry-title\"]");
	}
	public static void getAddress() {
		returnValue("//div[@class='onde']/p");
	}
	
	public static void clickSubMenuButtonBlog() {
		click("//li[@id=\"menu-item-15254\"]");
	}
	public static void clickThirdPost() {
		String xpath = "//div[@class=\"post-thumb-img-content post-thumb\"]";
		WebElement list = driver.findElement(By.xpath(xpath));
		List<WebElement> rows_table = list.findElements(By.xpath(xpath));
		rows_table.get(3).click();
	}
	
}
