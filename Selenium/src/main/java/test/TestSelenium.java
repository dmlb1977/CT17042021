package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Setear la ruta del chromedriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver");//agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();//inicializando chrome driver
		driver.get("https://www.google.com");

	}

}
