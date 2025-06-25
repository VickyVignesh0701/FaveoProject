package Faveo_Project;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://qa.faveodemo.com/faveo/public");
		driver.findElement(By.id("client_login")).click();
		
		driver.findElement(By.xpath("//input[@id='login_form_user_name']")).sendKeys("vicky07se@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_form_password']")).sendKeys("Demo@123");
		
		
	WebElement scroll = driver.findElement(By.xpath("//button[@id='default-login-button']"));
	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		Thread.sleep(2000);
       scroll.click();
   
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement proceedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Proceed')]")));

       
       proceedButton.click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//a[@id='client_widget_submitticket']")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("subject")).sendKeys("Subject");
      
//
//   
//    WebElement priorityDropdown = driver.findElement(By.id("priority_id"));
//   
//    Select select = new Select(priorityDropdown);
//   
//    select.selectByIndex(4);
   
//    WebElement Helptopic = driver.findElement(By.id("priority_id"));
//   
//    Select select1 = new Select(Helptopic);
//   
//    select1.selectByVisibleText("Support query");
   WebElement scroll1 = driver.findElement(By.xpath("(//label[@class='form-label v-popper--has-tooltip'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true);", scroll1);
		Thread.sleep(2000);
      scroll1.click();
       
   driver.switchTo().frame("description_ifr"); 

    driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("hi hellow");
 driver.switchTo().parentFrame();
    
    driver.findElement(By.xpath("//button[@id='client_form_submit']")).click();


       
       

	}

}
