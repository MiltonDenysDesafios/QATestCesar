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
		//click(comboHeaderMenu(dataTableInfo.get(0).get("Menu")));
	}
			
	
	
	public static void clickSubMenuButtonBlog() {
		click("//*[@id=\"menu-item-15254\"]/a/span[2]");
	}
	
	
}
