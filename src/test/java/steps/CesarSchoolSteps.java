package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CesarSchoolSteps {
	@Given("open the page 'Cesar School'")
    public void openPage(DataTable data) {
		page.BasePage.openHomePage(data);
 }
	@When("I open menu 'School'")
    public void openMenuSchool() {
		page.CesarSchoolPage.clickHeaderButtons();
	}
	@When("I click on 'Blog' option")
    public void clickBlog() {
		page.CesarSchoolPage.clickSubMenuButtonBlog();
	}
	@When("I go to the second posts page")
    public void goToSecondPostPage() {
		page.CesarSchoolPage.goToSecondPage();
		
	}
	@When("I print the title")
    public void printTitle() {
		page.CesarSchoolPage.getSecondTitle();
		
	}
	@When("I print the publication date")
    public void printPublicationDate() {
		page.CesarSchoolPage.getPublishDate();
	}
	@When("I access the third post page")
    public void accessThirdPostPage() {
		page.CesarSchoolPage.clickThirdPost();
	}
	@When("I print the post title")
    public void printTitlePost() {
		page.CesarSchoolPage.getTitlePost();
	}
	@When("I print the author")
    public void printAuthor() {
		
	}
	@When("I go to the end of page")
    public void goToTheEndOfPage() {
		page.BasePage.scroolDown();
	}
	@When("I print the address of the cesar school")
    public void printAddressCesarSchool() {
		page.CesarSchoolPage.getAddress();
	}
	

	
}
