package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass2 {

	@FindBy(xpath="//a[@class=\'gb_d\']") private WebElement GMAIL;
	
	public Pomclass2(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void gmail() {
		GMAIL.click();
	}
}
