package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside step-browser open");
		System.setProperty("webdriver.chrome.driver",
				"/C:/Users/malla/Downloads/chromedriver_win32 (4)/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
	}

	@When("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside step-user_is_on_google_search_page");
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']"));
	}

	@When("user enters text in the searchBox")
	public void user_enters_text_in_the_search_box() throws InterruptedException {
		System.out.println("inside step-user_enters_text_in_the_search_box");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step By Step");
		Thread.sleep(2000);
		
	}

	@And("hit enter")
	public void hit_enter() throws InterruptedException {
		System.out.println("inside step-user_hit enter");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigates to search results")
	public void user_is_navigates_to_search_results() {
		System.out.println("inside step-user is navigates to search results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
	}
}
