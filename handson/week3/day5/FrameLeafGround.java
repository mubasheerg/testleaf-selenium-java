package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameLeafGround {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/* I am inside a Frame */

		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text1 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("The text1 is " + text1);
		driver.switchTo().defaultContent();

		/* I am inside a nested Frame */

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		String text2 = driver.findElement(By.xpath("//button[@id='Click1']")).getText();
		System.out.println("The text2 is " + text2);
		driver.switchTo().defaultContent();

		/* Find the number of Frames */

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("frame2");
		List<WebElement> findElements = driver.findElements(By.xpath("//iframe"));
		int count = findElements.size();
		System.out.println("No. of Frames: " + count);
		// driver.switchTo().defaultContent();

		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./LeafGroundFrame.png");
		FileUtils.copyFile(source, destination);

		driver.close();
	}
}
