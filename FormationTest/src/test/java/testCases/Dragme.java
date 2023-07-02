package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Dragme {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://demoqa.com/droppable");
	    Thread.sleep(5000);
	    
	    WebElement Dragme;
	    WebElement Drophere;
	    Dragme = driver.findElement(By.id("draggable"));
	    Drophere = driver.findElement(By.id("droppable"));
	    Actions action = new Actions(driver);
	    action.dragAndDrop(Dragme, Drophere).perform();
	    
	    
	    WebElement message = driver.findElement(By.id("droppable"));
	    String texte;
	    texte = Drophere.getText();
	    Assert.assertEquals(texte,"Dropped!");
	    
	    System.out.println("TestOk");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
