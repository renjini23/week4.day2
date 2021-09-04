package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement courses = driver.findElement(By.linkText("TestLeaf Courses"));
		Actions builder = new Actions(driver);
		builder.moveToElement(courses).perform();
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.linkText("Selenium"));
		WebElement rpa = driver.findElement(By.linkText("RPA"));
		WebElement web = driver.findElement(By.linkText("WebServices"));
		System.out.print("Test Leaf courses are:- " + sel.getText() + " , " + rpa.getText() + " and " + web.getText());
		web.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
