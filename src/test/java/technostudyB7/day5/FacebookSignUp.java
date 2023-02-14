package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookSignUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createAccountButton.click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstNameInput.sendKeys("Steve");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastNameInput.sendKeys("Russo");

        WebElement emailInput = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        emailInput.sendKeys("test@technostudy.com");

        WebElement emailConfirmInput = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        emailConfirmInput.sendKeys("test@technostudy.com");

        WebElement passwordInput = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        passwordInput.sendKeys("123456789abc!");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("May");

        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByValue("3");

        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1980");

        WebElement maleOptionRadioButton = driver.findElement(By.cssSelector("input[value='2']"));
        maleOptionRadioButton.click();

        WebElement signUpButton = driver.findElement(By.cssSelector("button[name='websubmit']"));
        String signUpButtonText = signUpButton.getText();
        System.out.println(signUpButtonText);


        driver.quit();

    }
}
