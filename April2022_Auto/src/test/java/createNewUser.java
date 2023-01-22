import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createNewUser {
    public WebDriver driver;
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        System.setProperty("Webdriver.chrome.driver","c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php?");


    }

    @When("^I click on the sign in link$")
    public void iClickOnTheSignInLink() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        driver.findElement(By.name("email_create")).sendKeys("lanre_april@gmail.com");
    }
        @And("^I click the create account button$")
        public void iClickTheCreateAccountButton() {
            driver.findElement(By.cssSelector("#submitCreate > span")).click();
        }


    @And("^I enter all required details$")
    public void iEnterAllRequiredDetails() {

    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
    }

    @Then("^My new account should be created successfully$")
    public void myNewAccountShouldBeCreatedSuccessfully() {
    }


}
