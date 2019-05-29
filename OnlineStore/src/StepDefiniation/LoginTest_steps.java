package StepDefiniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest_steps {
		private WebDriver driver;

		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bishe\\ToolsQA_Cucumber\\OnlineStore\\chromedriver.exe");
			driver = (WebDriver) new ChromeDriver();
			driver.get("http://www.google.com");
		}

		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^User LogOut from the Application$")
		public void user_LogOut_from_the_Application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^Message displayed LogOut Successfully$")
		public void message_displayed_LogOut_Successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}


}
