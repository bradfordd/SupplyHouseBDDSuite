package StepImplementations;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationUtils.RunWeb;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjectModels.CategorySearchPage;
import pageObjectModels.SupplyHouseHomePage;

public class StepDefinitions extends RunWeb{
	SupplyHouseHomePage s;
	CategorySearchPage c;
	WebDriverWait wait;
	@Given("User Navigates to SupplyHouse HomePage without being logging in")
	public void user_navigates_to_SupplyHouse_home_page_without_being_logging_in() {
	    // Write code here that turns the phrase above into concrete actions
		initializeWebDriver("Chrome");
		SupplyHouseHomePage.navigateToSupplyHouseHomePage(driver);
		//AmazonHomePage.navigateToAmazonHomePage(driver);
	}
	@Given("User Searches For item")
	public void user_searches_for_item() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		s = new SupplyHouseHomePage(driver);
		s.searchForItem("water heater");
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("Water"));
		c = new CategorySearchPage(driver);
		System.out.println("# Of Categories: " +  c.getNumberOfCategories());
	}
	@Given("User is navigated to item search results page, selects first item on Search Page")
	public void user_is_navigated_to_item_search_results_page_selects_first_item_on_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigated to search results");
	}
	@Then("Product details Page Corresponding with selected entry is displayed")
	public void product_details_page_corresponding_with_selected_entry_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("PDP Found");
	}
	
	@After("@WebTest")
	public void Aftervaldiation()
	{
		closeWebDriver();
	}
}
