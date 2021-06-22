@Test
Feature: Discourse

   @Discourse
   Scenario: Validate Discourse topics
   Given open the page 'Discourse'
   |Option		|URL											|
   |Demo			|https://www.discourse.org|
   When I click on the Demo option in main menu
#	 And I scroll to the bottom of the page
#	 Then I print the title of all closed topics
#	 And I print number of items in each category and those that do not have a category
#	 And I print the title of the topic that contains the most views
	# And end the test


  