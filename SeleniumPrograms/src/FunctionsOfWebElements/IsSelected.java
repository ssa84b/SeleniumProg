package FunctionsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		driver.findElement(By.xpath("/html/body/div/form/fieldset/select/option[1]")).click();
//		driver.findElement(By.xpath("/html/body/div/form/fieldset/select/option[3]")).click();

		boolean ab= driver.findElement(By.xpath("/html/body/div/form/fieldset/select/option[1]")).isSelected();
		System.out.println(ab);
		boolean bc= driver.findElement(By.xpath("/html/body/div/form/fieldset/select/option[3]")).isSelected();
		System.out.println(bc);
	}

}
