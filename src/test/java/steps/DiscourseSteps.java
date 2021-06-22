package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DiscourseSteps {

	
	@Given("open the page 'Discourse'")
    public void openPage(DataTable data) {
		page.BasePage.openHomePage(data);
 }
	@When("I click on the Demo option in main menu")
    public void clickDemo() {
		page.DiscoursePage.clicarOpcaoDemo();
	}
	@And("I scroll to the bottom of the page")
    public void scrollDownPage() {		
 }
	@Then("I print the title of all closed topics")
    public void PrintTitleAllClosedTopics() {
		
 }
	@And("I print number of items in each category and those that do not have a category")
    public void printNumberOfItemsEachCategoryAndThoseThatDoNotHaveOne() {
	
 }
	@And("I print the title of the topic that contains the most views")
    public void printTitleTopicContainsMostViews() {
 }
	
	@And("end the test")
    public void endTest() {
		page.BasePage.quitDriver();
 }
	 
	
	
	
}
