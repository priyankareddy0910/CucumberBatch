package StepDefination;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	
	public WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(options);
	      driver.get("https://www.ikea.com/in/en/new/");
	      driver.manage().window().maximize();
          Thread.sleep(3000);
		
	   
	}

	@When("user enters credentials using Datatable")
	public void user_enters_credentials_using_datatable(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data =dataTable.cells();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			Actions a = new Actions(driver);
			WebElement login = driver.findElement(By.xpath("//span[text()='Hej! Log in or sign up']"));
			a.moveToElement(login).click().build().perform();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get(1));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
	  
	   
	}

	
	@Then("user should land on Home page")
	public void user_should_land_on_home_page() {
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
	    Assert.assertEquals("IKEA", tittle);
	}



}
