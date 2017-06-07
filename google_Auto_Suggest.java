package Googlesearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_Auto_Suggest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https:\\www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("hello there");
		String part1 = ".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[";
		String part2 = "]";
		
		for (int i = 1;i<5;i++)
		{
			String text = driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
		}

	}

}
