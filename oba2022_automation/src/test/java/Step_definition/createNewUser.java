package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class createNewUser {
    public WebDriver driver;
    public int random;
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
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
        random = 100 + (int)  (Math.random()* (1000-1) + 1);
        driver.findElement(By.name("email_create")).sendKeys("lanre_april" + random + "@gmail.com");
    }
    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() {
        driver.findElement(By.cssSelector("#submitCreate > span")).click();
        }


    @And("^I enter all required details$")
    public void iEnterAllRequiredDetails() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Dorice");
        driver.findElement(By.id("customer_lastname")).sendKeys("Mbonde");
        driver.findElement(By.id("passwd")).sendKeys("testing");
        new Select (driver.findElement(By.id("days"))).selectByIndex(10);
        new Select (driver.findElement(By.id("months"))).selectByIndex(5);
        new Select (driver.findElement(By.id("years"))).selectByValue("1990");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("address1")).sendKeys("1 fake street");
        driver.findElement(By.id("city")).sendKeys("Chicago");
        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
        driver.findElement(By.id("postcode")).sendKeys("00000");
        driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
        driver.findElement(By.id("alias")).sendKeys("Testing House");
    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();


    }

    @Then("^My new account should be created successfully$")
    public void myNewAccountShouldBeCreatedSuccessfully() {
        String ExpectedLoggedUser = "Dorice Mbonde";
        String ActualLoggedUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLoggedUser, ActualLoggedUser);
        System.out.println(ActualLoggedUser);

        driver.quit();
    }


}
