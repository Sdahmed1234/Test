package Examen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Examen1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
WebDriver driver;
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to("http://lskl.devxperts.tn/");
WebElement username;
WebElement password;
username= driver.findElement(By.id("A4"));
password= driver.findElement(By.id("A9"));
username.sendKeys("Aline");
password.sendKeys("AlineAline");
WebElement connexionButton= driver.findElement(By.id("A7"));
connexionButton.click();
Thread.sleep(5000);

String expectedUrl="http://lskl.devxperts.tn/";
String actualUrl = driver.getCurrentUrl();

WebElement Jourférié = driver.findElement(By.xpath("//*[@id=\"HTMMENUS\"]/table/tbody/tr[10]/td[3]/a"));
Jourférié.click();
Thread.sleep(5000);

WebElement ajoutjourférié = driver.findElement(By.id("M93"));
WebElement Libellé = driver.findElement(By.xpath("//*[@id=\"I2\"]"));
WebElement date= driver.findElement(By.xpath("//*[@id=\"I3\"]"));

ajoutjourférié.click();
Libellé.sendKeys("JourFérié");
date.sendKeys("25-06-2024");


WebElement sauvegardeButton = driver.findElement(By.id("z_M78_IMG"));

sauvegardeButton.click();
WebElement SuccessMessage = driver.findElement(By.id("zrl_13_M65"));


WebElement LogoutButton = driver.findElement(By.id("M22"));
Select select = new Select(LogoutButton); 
select.selectByValue("2");

		

	
	}

}
