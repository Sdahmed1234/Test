package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrangeConnexion {

	public static void main(String[] args) throws InterruptedException {
		// identification (chemin) Chromedriver
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe"); // environnement
				// ouverture chrome
				WebDriver driver; // driver= copie de webdriver
				driver = new ChromeDriver();
				// maximize window
				driver.manage().window().maximize(); // window=fenetre
				// delete cookies
				driver.manage().deleteAllCookies();
				
				// ouvrir URL: que se soit par la commande get ou navigate
				// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(5000);

				// déclaration des variables invalides
				WebElement username;
				WebElement password;
				WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
				// identification des variables invalides
				username = driver.findElement(By.name("username"));
				password = driver.findElement(By.name("password"));
				
				// action
				username.sendKeys("Admin");
				password.sendKeys("admin123");
				LoginButton.click();
				Thread.sleep(5000);
				
				WebElement profil;
				profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
				String texte;
				texte = profil.getText();
				Assert.assertEquals(texte,"MUHAMMAD ANWAR");
				
				System.out.println("Test OK");
				
				driver.close();
				
				
	}

}
