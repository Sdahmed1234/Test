package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AuthFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement Creerunnouveaucompte;
		Creerunnouveaucompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Actions action= new Actions(driver);
		action.click(Creerunnouveaucompte).perform();
		
		WebElement Prenom;
		WebElement Nomdefamille;
		WebElement NumDeMobouEmail;
		WebElement NouvMotdepasse;
		WebElement Datedenaissance;
		WebElement Datedenaissance1;
		WebElement Datedenaissance2;
		WebElement Genre;
		WebElement Genre1;
		WebElement Genre2;
		WebElement inscrire;
		
		Prenom = driver.findElement(By.xpath("//input[@name='firstname']"));
		Nomdefamille = driver.findElement(By.xpath("//input[@name='lastname']"));
		NumDeMobouEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		NouvMotdepasse = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Datedenaissance = driver.findElement(By.xpath("//select[@title='Jour']"));
		Datedenaissance1 = driver.findElement(By.xpath("//select[@title='Mois']"));
		Datedenaissance2 = driver.findElement(By.xpath("//select[@title='Année']"));
		Genre = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		Genre1 = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		Genre2 = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
		inscrire = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		Prenom.sendKeys("ahmed");
		Nomdefamille.sendKeys("ahmed");
		NumDeMobouEmail.sendKeys("4587945");
		NouvMotdepasse.sendKeys("jqsdyqzoupq");
		Select select = new Select(Datedenaissance);
		select.selectByValue("11");
		Select select1 = new Select(Datedenaissance1);
		select1.selectByVisibleText("jun");
		Select select2 = new Select(Datedenaissance2);
		select2.selectByValue("1988");
		
		Actions action1= new Actions(driver);
		action.click(Genre1).perform();
		
		Actions action2= new Actions(driver);
		action.click(inscrire).perform();
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		

	}

}
