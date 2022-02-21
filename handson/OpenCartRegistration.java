package week2.day5.handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegistration {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("MubasheerG");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mubasheer");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.name("email")).sendKeys("mubasheer1401@gmail.com");
		driver.findElement(By.name("password")).sendKeys("qwerty@123");

		driver.close();

	}
}
