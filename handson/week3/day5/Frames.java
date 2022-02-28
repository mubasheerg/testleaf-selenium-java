package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input")).sendKeys("pets");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("animals")).click();
		driver.findElement(By.xpath("//option[text()='Big Baby Cat']")).click();
		driver.switchTo().defaultContent();
		
	}
}