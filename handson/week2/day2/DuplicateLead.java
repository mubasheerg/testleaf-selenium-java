package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("mubasheer1401@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("Mubasheer")).click();

		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title is verified and it is correct");
		} else {
			System.out.println("Title is verified and it is incorrect");
		}

		String capName = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(capName);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String dupName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(dupName);
		if (capName.equals(dupName)) {
			System.out.println("Both names are same");
		} else {
			System.out.println("Both are not same");
		}

	}

}
