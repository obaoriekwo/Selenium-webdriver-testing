package Step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLogin {
    public WebDriver driver;
    @Given("^I am on the landing page$")
    public void iAmOnTheLandingPage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php?");
    }

    @And("^I select the sign in button$")
    public void iSelectTheSignInButton() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);

    }
    @And("^I type \"([^\"]*)\"$")
    public void iType(String password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(password);
    }

        @When("^I select the login button$")
    public void iSelectTheLoginButton() {
        driver.findElement(By.id("submitLogin")).click();
    }

    @Then("^I should get the right \"([^\"]*)\"$")
    public void iShouldGetTheRight(String errormessage) throws Throwable {
        String ExpectedErrorMessage = errormessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column`\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

        driver.quit();

    }


}
