@Test
Feature: Discourse

   @CesarSchool
   Scenario: Validate Cesar School topics
   Given open the page 'Cesar School'
   |Menu				|URL											|
   |School			|https://www.cesar.school	|
   When I open menu 'School'
	 And I click on 'Blog' option
	 And I go to the second posts page
	 Then I print the title
	 And I print the publication date
	 And I access the third post page
	 And I print the title
	 And I print the author
	 And I go to the end of page
	 And I print the address of the cesar school
	 And end the test

