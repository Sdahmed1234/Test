package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEvent {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
			WebDriver driver;
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://demoqa.com/text-box");
			
			WebElement FullName;
			WebElement Email;
			WebElement Currentadress;
			WebElement Permanentadress;
			
			FullName = driver.findElement(By.id("userName"));
			Email = driver.findElement(By.id("userEmail"));
			Currentadress = driver.findElement(By.id("currentAddress"));
			Permanentadress = driver.findElement(By.id("permanentAddress"));
			
            Actions action = new Actions(driver);
            FullName.sendKeys("SDAHMED");
            Email.sendKeys("azer.gmail.com");
            Currentadress.sendKeys("200 avenue de la liberté tunis");
			action.keyDown(Currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Permanentadress, Keys.CONTROL).perform();
			action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		

	}

}
