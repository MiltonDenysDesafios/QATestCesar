package page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

public class CesarSchoolPage extends BasePage{

	protected static List<WebElement> listOfElements;

	public static String comboHeaderMenu(String menuOption) {
		Map<String, String> xpaths = new HashMap<String, String>();
		xpaths.put("CESAR School ON", "//*[@id=\"menu-item-15713\"]/a/span[2]");
		xpaths.put("SCHOOL", "//*[@id=\"menu-item-15376\"]/a/span[2]");
		xpaths.put("Vestibular 2021.2", "//*[@id=\"menu-item-17904\"]/a/span[2]");
		xpaths.put("GRADUAÇÃO", "//*[@id=\"menu-item-7611\"]/a/span[2]");
		xpaths.put("PÓS-GRADUAÇÃO", "//*[@id=\"menu-item-7612\"]/a/span[2]");
		xpaths.put("EXTENSÃO", "//*[@id=\"menu-item-7614\"]/a/span[2]");
		xpaths.put("FORMAÇÃO EXECUTIVA", "//*[@id=\"menu-item-15614\"]/a/span[2]");
		return xpaths.get(menuOption).toLowerCase().toString();
	}
	public static void clickHeaderButtons() {
		hoverAction(comboHeaderMenu(dataTableInfo.get(0).get("Menu")));
	}
			
	
	public static void getTitle() {
		returnValue("//*[@id=\"post-26005\"]/div/div/header/h2/a");
	}
	public static void getPublishDate() {
		returnValue("//*[@id=\"post-26005\"]/div/div/div[1]/a/div/span");
	}
	public static void getTitlePost() {
		returnValue("//*[@id=\"post-25690\"]/div/header/div[2]/h1");
	}
	public static void getAddress() {
		returnValue("//div[@class='onde']/p");
	}
	
	public static void clickSubMenuButtonBlog() {
		click("//*[@id=\"menu-item-15254\"]/a/span[2]");
	}
	public static void clickThirdPost() {
		click("//*[@id=\"post-25690\"]/div/div/div[1]/div/a/img");
	}
	
}
