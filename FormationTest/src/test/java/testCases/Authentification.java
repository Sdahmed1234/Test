package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Authentification {

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// ouvrir URL: que se soit par la commande get ou navigate
		// driver.get("http://lskl.devxperts.tn/");
		driver.navigate().to("http://lskl.devxperts.tn/");
		Thread.sleep(5000);

		// déclaration des variables valides
		WebElement username;
		WebElement motDePasse;
		// identification des variables valides
		username = driver.findElement(By.id("A4"));
		motDePasse = driver.findElement(By.id("A9"));

		// action
		username.sendKeys("Aline");
		motDePasse.sendKeys("AlineAline");

		WebElement connexionButton = driver.findElement(By.id("A7"));
		connexionButton.click();
		Thread.sleep(5000);
		// Vérifier que l'utilisateur est redirigé vers la page d'accueil
		String expectedUrl = "http://lskl.devxperts.tn/";
		String actualUrl = driver.getCurrentUrl();
		// Sélectionner le menu "Jour férié"
		WebElement JourfériéMenu = driver.findElement(By.xpath("//*[@id=\"HTMMENUS\"]/table/tbody/tr[10]/td[3]/a"));
		JourfériéMenu.click();
		Thread.sleep(5000);
	// Ajouter un jour férié
		
		WebElement ajoutJourférié = driver.findElement(By.id("M93"));
		
		WebElement Libellé = driver.findElement(By.xpath("//*[@id=\"I2\"]"));
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"I3\"]"));

		ajoutJourférié.click();
		Thread.sleep(5000);
		Libellé.sendKeys("Jourférié");
		date.sendKeys("25-07-2024");


		
		
		// Cliquer sur le bouton SAUVEGARDER
		WebElement sauvegarderButton = driver.findElement(By.id("z_M78_IMG"));
		sauvegarderButton.click();
		// Vérifier que le jour férié a été ajouté avec succès
		WebElement successMessage = driver.findElement(By.id("zrl_13_M65"));

		// Se déconnecter de l'application
		WebElement logoutButton = driver.findElement(By.id("M22"));
		Select select = new Select(logoutButton);
		select.selectByValue("2");
	}
}

	
		
