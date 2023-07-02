package Examen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aut {

	public static <Select> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://lskl.devxperts.tn/");
		
		Thread.sleep(5000);
		
		WebElement username;
		WebElement Motdepasse;
		WebElement connexionButton;
	
		
		
		username=driver.findElement(By.id("A4"));
		Motdepasse=driver.findElement(By.id("A9"));
		username.sendKeys("Aline");
		Motdepasse.sendKeys("AlineAline");
	    connexionButton=driver.findElement(By.id("A7"));
	    
	    
	    connexionButton.click();
	    
	    WebElement jourférié;
	    jourférié=driver.findElement(By.xpath("//*[@id=\"HTMMENUS\"]/table/tbody/tr[10]/td[3]/a"));
	    jourférié.click();
	    Thread.sleep(3000);
	    WebElement ok;
	    ok= driver.findElement(By.xpath("//*[@id=\"z_BTNOK_IMG\"]/span"));
	    ok.click();
	    
	    WebElement Ajoutjourférié;
	    Ajoutjourférié=driver.findElement(By.xpath("//*[@id=\"M93\"]"));
	    Thread.sleep(3000);
	    
	    Ajoutjourférié.click();
	    
	    WebElement libellé;
	    WebElement date;
	    libellé=driver.findElement(By.id("I2"));
	    date=driver.findElement(By.id("I3"));
	    
	    libellé.sendKeys("JourFérié");
	    date.sendKeys("06-28-2023");
	    
	    WebElement Sauvegarder;
	    Sauvegarder=driver.findElement(By.xpath("//*[@id=\"z_M78_IMG\"]/span"));
	    
	    Sauvegarder.click();
	    
	    
	    WebElement AlineAline;
	   AlineAline=driver.findElement(By.id("M22"));
	   AlineAline.click();
	   
	   
	   
	   
	   

	    
	    
	    
	    
	    
	    
		
		

	}

}



