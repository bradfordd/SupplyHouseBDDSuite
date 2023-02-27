package pageObjectModels;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CategorySearchPage extends BasePageObject {
	protected WebDriver driver;
	
	public CategorySearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public int getNumberOfCategories() {
		return itemCategories.size();
	}
	
	@FindBy(xpath="//a[@class='Box-sc-1z9git-0 fDOPef CategoryTileLink-sc-rz7j01-0 fkxXHf Box-sc-1z9git-0 Flex-sc-1qhr4qe-0 CategoryTile__CategoryTileContainerFlex-sc-1giyifi-2 gUKiTB dNxDHg goVhUA']")
	List<WebElement> itemCategories;
}
