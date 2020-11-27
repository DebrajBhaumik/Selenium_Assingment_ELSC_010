package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateUserRegisterforCourse {
	public WebDriver driver;
	
	
	@Given("I logged in as an admin user")
	public void i_logged_in_as_an_admin_user() {
	 
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearning.upskills.in/");
        driver.findElement(By.id("login")).sendKeys("admin"); 
        driver.findElement(By.id("password")).sendKeys("admin@123"); 
        driver.findElement(By.id("form-login_submitAuth")).click();
          
        }

	@Given("click on the add a user link")
	public void click_on_the_add_a_user_link() {
    driver.findElement(By.linkText("Add a user")).click();
    
     
	}
	@Given("I am able to see Add a user page gets open")
	public void i_am_able_to_see_add_a_user_page_gets_open() {
		
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);
	  
	}
	@Given("I entered {string} & {string} & {string} & {string} & {string}")
	public void i_entered(String firstname, String lastname, String email, String username, String pass1) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("firstname")).sendKeys(firstname);
	    	driver.findElement(By.id("lastname")).sendKeys(lastname); 
	    	driver.findElement(By.id("email")).sendKeys(email);   
	    	driver.findElement(By.id("username")).sendKeys(username); 
			driver.findElement(By.id("password")).sendKeys(pass1);  
				    	
	}
	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {
		driver.findElement(By.name("submit")).click();
	}
	@Then("I am able to see user creation is successful")
	public void i_am_able_to_see_user_creation_is_successful() {
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);;
	}
	@Then("I click on the {string} link")
	public void i_click_on_the_link(String string) {
		
		 driver.findElement(By.linkText("Administration")).click();
	}
	
	@Then("I am able to see user courses page")
	public void i_am_able_to_see_user_courses_page() {
		String pageTitle1=driver.getTitle();
        System.out.println(pageTitle1);;
	}
		
	@Then("I click the {string} link")
	public void i_click_the_link(String string) {
	driver.findElement(By.linkText("Add users to course")).click();
	  
	}
	
	 @Then("I am able see Enrolment by classes page")
	 public void i_am_able_see_enrolment_by_classes_page() {
		 String pageTitle1=driver.getTitle();
	     System.out.println(pageTitle1);
	 }
	
	@Then("I select the <user> created ealier from the user list drop down")
	public void i_select_the_user_created_ealier_from_the_user_list_drop_down() {
		
	Select select = new Select(driver.findElement(By.name("UserList[]")));
		select.selectByVisibleText("003 test (test003)");
	  
	}
	@Then("I select a course from the course list")
	public void i_select_a_course_from_the_course_list() {
	Select select = new Select(driver.findElement(By.name("CourseList[]")));
	    select.selectByVisibleText("(123) Automation_BM");
	}
	@When("I click on the <Add to the course > button")
	public void i_click_on_the_add_to_the_course_button() {
		driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')]")).click();
	   
	}
	@Then("I am able to see {string} message")
	public void i_am_able_to_see_message(String string) {
		 String pageTitle1=driver.getTitle();
	     System.out.println(pageTitle1);
	     driver.findElement(By.xpath("//*[contains(@class,'img-circle')]")).click();
	     driver.findElement(By.id("logout_button")).click();
	     driver.close();
	}
	

}
