package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

public class Clickme {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement ClickMe;
		
		ClickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		
		Actions action= new Actions(driver);
		action.click(ClickMe).perform();
	
		
		WebElement message= driver.findElement(By.id("dynamicClickMessage"));
		String texte;
		texte = message.getText();
		Assert.assertEquals(texte,"You have done a dynamic click");
		
		System.out.println("Dynamic click done");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
