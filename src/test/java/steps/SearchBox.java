package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {

   @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\Cucu\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
System.out.println("Its works");
    }

    @Then("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        System.out.println("Its works too");
    }




}
