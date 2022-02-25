package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		Actions builder = new Actions(driver);
		WebElement page = driver.findElement(By.linkText("Men's Fashion"));
		builder.moveToElement(page).perform();
		driver.findElement(By.linkText("Sports Shoes")).click();

		String title = driver.getTitle();
		System.out.println(title);
		if (title == "Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands") {
			System.out.println("Title verified and correct");
		} else {
			System.out.println("Title error");
		}

		String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println("Number of shoes:" + count);

	}
}