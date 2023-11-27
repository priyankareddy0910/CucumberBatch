package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	
		
		public WebDriver driver;
			
			@Given("browser is open")
			public void browser_is_open() throws InterruptedException {

				System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			      driver = new ChromeDriver(options);
				
			    
			}

			@Given("User is on Search Page")
			public void user_is_on_search_page() throws InterruptedException {	
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
			    

			}

			@When("User enters a text in a search box")
			public void user_enters_a_text_in_a_search_box() throws InterruptedException {
		   driver.findElement(By.name("q")).sendKeys("Automation step by step");
			Thread.sleep(3000);
			
			}
			
			@When("User enters {string} text in a search box")
			public void user_enters_text_in_a_search_box(String searchvalue) throws InterruptedException {
				
				 driver.findElement(By.name("q")).sendKeys(searchvalue);
					Thread.sleep(3000);
					
				
				
			   
			}
			
			

			@When("hits enter")
			public void hits_enter() throws InterruptedException {
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
			   
			}

			@Then("User is navigate to search results")
			public void user_is_navigate_to_search_results() throws InterruptedException {
				
				driver.getPageSource().contains("online Courses");
				Thread.sleep(3000);
				driver.close();
				driver.quit();
				
			    
			}
			
			

		}




