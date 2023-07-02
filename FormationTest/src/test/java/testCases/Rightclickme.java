package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Rightclickme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement Rightclick;
		Rightclick = driver.findElement(By.id("rightClickBtn"));
		
		
		
		Actions action= new Actions(driver);
		
		action.contextClick(Rightclick).perform();
		
		WebElement message= driver.findElement(By.id("rightClickMessage"));
		
		String texte;
		texte = message.getText();
		Assert.assertEquals(texte,"You have done a right click");
		
		System.out.println("right click done");
		
		driver.close();
		
		
		
		
		
	
	}

}
