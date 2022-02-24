package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpForm {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.name("UserFirstName")).sendKeys("Mubasheer");
		driver.findElement(By.name("UserLastName")).sendKeys("G");
		driver.findElement(By.name("UserEmail")).sendKeys("mubasheer1401@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TESTLEAF");
		driver.findElement(By.name("UserPhone")).sendKeys("9791843028");

		WebElement userTitle = driver.findElement(By.name("UserTitle"));
		Select tap = new Select(userTitle);
		tap.selectByIndex(5);

		WebElement CompanyEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select sel1 = new Select(CompanyEmployees);
		sel1.selectByIndex(2);

		driver.findElement(By.name("CompanyCountry")).sendKeys("India");
		driver.findElement(By.xpath("//select[@name='CompanyState']")).sendKeys("Tamil_Nadu");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
	}
}
