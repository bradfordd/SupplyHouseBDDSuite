package pageObjectModels;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SupplyHouseHomePage extends BasePageObject{
	protected WebDriver driver;
	public SupplyHouseHomePage(WebDriver driver) {
		super(driver);
		Assert.assertEquals(this.getCurrentUrl(), "https://www.supplyhouse.com/");
		PageFactory.initElements(driver, this);
	}
	
	public static void navigateToSupplyHouseHomePage(WebDriver driver) {
		driver.get("https://www.supplyhouse.com/");
	}
	
	public void searchForItem(String item) throws InterruptedException {
		topSearchBar.sendKeys(item);
		searchBarSubmitButton.click();
	}
	
	
	@FindBy(id="react-header-search-input")
	WebElement topSearchBar;
	
	@FindBy(id="headerSearchSubmitButton")
	WebElement searchBarSubmitButton;
	
	
	
}
