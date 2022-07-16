package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass1 {

	@FindBy(xpath="//input[@name='q']") private WebElement SEARCH;
	
	@FindBy(xpath="//input[@class='gNO89b']") private WebElement GSEARCH;
	public Pomclass1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void search() {
		SEARCH.sendKeys("selenium");
	}
	
	public void gsearch() {
		GSEARCH.click();
	}
}
