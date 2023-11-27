package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify {
	
public WebDriver driver;
	
	@Given("user is alaredy on Login page")
	public void user_is_alaredy_on_login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(options);
	      driver.get("https://www.freecrm.com/");
	      driver.manage().window().maximize();
          Thread.sleep(3000);
		
		
	    
	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
	  Assert.assertEquals("#1 Free CRM Power Up your Entire Business Free Forever", title);
	    
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		}
	

	@Then("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginBtn =driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	     JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);

	 }
	

		@Then("user is on Homepage")
	public void user_is_on_homepage() {
		
		String title =driver.getTitle();
		System.out.println("home title"+title);
		Assert.assertEquals("Cogmento CRM", title);
	
		
	}
		
		@Then("user move to new contactpage")
		public void user_move_to_new_contactpage() throws InterruptedException {
			Thread.sleep(5000);
		Actions a = new Actions(driver);
		//WebElement contacts = driver.findElement(By.xpath("//a[@href='/contacts']"));
		a.moveToElement(driver.findElement(By.xpath("//a[@href='/contacts']"))).click().build().perform();
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
		Thread.sleep(3000);
		 
		}
		
		@Then("user enters contactdetails {string} and {string}")
		public void user_enters_contactdetails_and(String firstname, String lastname) {
			driver.findElement(By.name("first_name")).sendKeys("priyanka");
			driver.findElement(By.name("last_name")).sendKeys("password");
		}
			


		@Then("click on save")
		public void click_on_save() {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		}
		

		@Then("close the browser")
		public void close_the_browser() {
		   driver.quit();
		}



}



