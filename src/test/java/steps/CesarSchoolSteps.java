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
		
	}
	@When("I print the title")
    public void printTitle() {
		
	}
	@When("I print the publication date")
    public void printPublicationDate() {
		
	}
	@When("I access the third post page")
    public void accessThirdPostPage() {
		
	}
	@When("I print the title1")
    public void printTitle1() {
		
	}
	@When("I print the author")
    public void printAuthor() {
		
	}
	@When("I go to the end of page")
    public void goToTheEndOfPage() {
		
	}
	@When("I print the address of the cesar school")
    public void printAddressCesarSchool() {
		
	}
	

	
}
