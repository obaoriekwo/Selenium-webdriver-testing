package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepagelogo_Login {
    public WebDriver driver;

    //@Given("^I launch a browser$")
    //public void i_launch_a_browser() throws Throwable {
        //System.setProperties("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //driver = new ChromeDriver();

    //}

    //@Given("^I enter application url$")
    //public void i_enter_application_url() throws Throwable {
        //driver.navigate().to("http://automationpractice.com/index.php?");

    //}

    @When("^I see the application logo$")
    public void i_see_the_application_logo() throws Throwable {
        driver.findElement(By.id("header_logo")).isDisplayed();

    }

    @When("^I click on the sign in button$")
    public void i_click_on_the_sign_in_button() throws Throwable {
        driver.findElement(By.className("login")).click();

    }

    @When("^I enter valid username$")
    public void i_enter_valid_username() throws Throwable {
        driver.findElement(By.name("email")).sendKeys("lanre.ikuesan+@gmail.com");


    }

    @When("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("testing");

    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        driver.findElement(By.id("submitLogin")).click();

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        String ExpectedLoggedUser = "Tinu Sotunde";
        String ActualLoggedUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedUser, ActualLoggedUser);
        System.out.println(ActualLoggedUser);

        driver.quit();


    }




}

