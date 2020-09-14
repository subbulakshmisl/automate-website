package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First {
	
	

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalcaribbean.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
			driver.findElement(By.id("rciHeaderMenuItem-3")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div/figure/img"))).click().build().perform();
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/div[1]/div/div[4]/div/div/div/div/div[3]/a")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/div[1]/label/select/option[7]")).click();
			String ss = "royal suit";
			
		 
	if(ss.contains( driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/section[2]/section[1]/div[2]/section[5]/h4")).getText()))
	{System.out.println("passed");
	}
	else
	{
		System.out.println("Failed");
	}
	driver.close();
	}
	
	
	
}
