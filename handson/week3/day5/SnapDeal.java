package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action = new Actions(driver);
		WebElement b = driver.findElement(By.linkText("Men's Fashion"));
		action.moveToElement(b).perform();
		driver.findElement(By.linkText("Sports Shoes")).click();

		String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);

		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("900");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");

		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();

		WebElement image = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		action.moveToElement(image).perform();
		driver.findElement(By.xpath("//div[@pogid='621868725223']")).click();

		String g = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println(g);

		String h = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(h);

		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshot/snapDeal.png");
		FileUtils.copyFile(source, destination);

		driver.close();
	}
}
