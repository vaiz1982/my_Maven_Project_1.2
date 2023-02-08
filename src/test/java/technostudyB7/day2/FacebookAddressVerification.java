package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String email = "mustafa@techno.study";
        String password = "12345";


        driver.get("https://www.facebook.com");

        WebElement emailBox =driver.findElement(By.id("email"));
        emailBox.sendKeys(email);

        //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass"
        // id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">

        WebElement passwordBox=driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);

        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login"
        // data-testid="royal_login_button" type="submit" id="u_0_5_dl">Log In</button>

        WebElement loginButton=driver.findElement(By.name("login"));
        loginButton.click();

        driver.quit();


    }
}
