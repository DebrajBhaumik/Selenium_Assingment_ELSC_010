package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpFunctionality {
	public WebDriver driver;
	

	@Given("user should have launched the application & present on home screen")
	public void user_should_have_launched_the_application_present_on_home_screen() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearning.upskills.in/");
	}


	@Given("sign up link is clicked")
	public void sign_up_link_is_clicked() {
		driver.findElement(By.linkText("Sign up!")).click();
	   
	}
	@Given("registered page gets open")
	public void registered_page_gets_open() {
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);
	}
	@Given("I click on the taech course radio buttion")
	public void i_click_on_the_taech_course_radio_buttion() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//p[contains(text(), 'Teach courses')]")).click();
				
	}
	@When("valid details are entered {string} & {string} & {string} & {string} & {string} & {string} & {string}")
	public void valid_details_are_entered(String firstname, String lastname, String email, String username, String pass1, String pass2, String phone) {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("registration_firstname")).sendKeys(firstname);
	    	driver.findElement(By.id("registration_lastname")).sendKeys(lastname); 
	    	driver.findElement(By.id("registration_email")).sendKeys(email);  
			driver.findElement(By.id("username")).sendKeys(username); 
			driver.findElement(By.id("pass1")).sendKeys(pass1);  
			driver.findElement(By.id("pass2")).sendKeys(pass2);  
			driver.findElement(By.id("registration_phone")).sendKeys(phone);  
	}
	@When("clicked on register link")
	public void clicked_on_register_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_submit")).click();
	}
	@Then("home screen with  newly crated user name should get diplayed")
	public void home_screen_with_newly_crated_user_name_should_get_diplayed() {
	    // Write code here that turns the phrase above into concrete actions
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);
	}



	

}
