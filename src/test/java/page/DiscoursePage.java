package page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DiscoursePage extends BasePage{
	
	
	public static String comboHeaderOptions(String headerOption) {
		Map<String, String> xpaths = new HashMap<String, String>();
		xpaths.put("About", "//a[@class='menu__link'");
		xpaths.put("Features", "//*[@id=\"main\"]/ul/li[2]/a");
		xpaths.put("Community", "//*[@id=\"main\"]/ul/li[3]/a");
		xpaths.put("Demo", "//*[@id=\"main\"]/ul/li[4]/a");
		xpaths.put("Pricing", "//*[@id=\"main\"]/ul/li[5]/a");
		return xpaths.get(headerOption).toLowerCase().toString();
	}
	
	
	public static void clicarOpcaoDemo() {		
		String option = dataTableInfo.get(0).get("Option");
		click(comboHeaderOptions(option));
	}
	public static void ScrollDownNewPageDiscourse() {		
		  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs2.get(1));
		  scroolDown();
	}
	
	public static void printClosedTopics() {
		String xpath = "//span[@class = 'link-top-line']";
		WebElement list = driver.findElement(By.xpath("\"//*[contains(text(),'This topic is closed; it no longer accepts new replies')]\""));
		List<WebElement> rows_table = list.findElements(By.xpath(xpath));
		rows_table.get(0).click();
		
		
		WebElement m = driver.findElement (By.xpath ("//*[contains(text(),'This topic is closed; it no longer accepts new replies')]"));
	}
	

	
}
