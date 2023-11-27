package StepDefination;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

		
		@Before(order=1)
		public void setup(){
			System.out.println("lanuch the application");
			
		}
		
		
		@After
		public void tearDown() {
			System.out.println("close the application");
			
		}
		
		@BeforeStep
		public void login() {
			System.out.println("open the browser before step");
			
		}
		
		@Before(order=2)
		public void log() {
			System.out.println("close the browser before step order2");
			
		}
		
		
		@AfterStep
		public void logout() {
			System.out.println("close the browser After every step");
			
		}
		
		
		
		
		
		

	}


