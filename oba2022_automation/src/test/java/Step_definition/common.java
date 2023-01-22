package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
    public WebDriver driver;

    @Given("^I am on the home page screen$")
    public void iAmOnTheHomePageScreen() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php?");

    }

    @And("^I Select sign in$")
    public void iSelectSignIn() {
        driver.findElement(By.className("login")).click();
    }


}
