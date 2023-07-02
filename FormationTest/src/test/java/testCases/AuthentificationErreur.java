package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthentificationErreur {

	public static void main(String[] args) {
		// identification (chemin) Chromedriver
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe"); // environnement
				// ouverture chrome
				WebDriver driver; // driver= copie de webdriver
				driver = new ChromeDriver();
				// maximize window
				driver.manage().window().maximize(); // window=fenetre
				// delete cookies
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// ouvrir URL: que se soit par la commande get ou navigate
				// driver.get("http://lskl.devxperts.tn/");
				driver.navigate().to("http://lskl.devxperts.tn/");

				// déclaration des variables invalides
				WebElement username;
				WebElement motDePasse;
				// identification des variables invalides
				username = driver.findElement(By.id("A4"));
				motDePasse = driver.findElement(By.id("A9"));

				// action
				username.sendKeys("Aline");
				motDePasse.sendKeys("PWDErreur");

				WebElement connexionButton = driver.findElement(By.id("A7"));
				connexionButton.click();
System.out.println("Code d'usager ou mot de passe invalide");

	}

}
