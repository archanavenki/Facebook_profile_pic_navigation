package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class faceBook_actionClass {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("username");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div/div[2]/div/div/div/a")).click();
		WebElement updateprofilepic = driver.findElement(By.xpath(".//*[@id='fbTimelineHeadline']/div[3]/div/div/div/div/a"));
		
		Actions profilepicact = new Actions(driver);
		profilepicact.moveToElement(updateprofilepic).build().perform();
		driver.findElement(By.xpath(".//*[@id='fbTimelineHeadline']/div[3]/div/div/div/div/a/i")).click();
		//driver.findElement(By.xpath(".//a[@data-action-type='upload_photo']")).click();
		
		driver.findElement(By.xpath("//input[@title='Choose a file to upload']")).click();
	}

}
