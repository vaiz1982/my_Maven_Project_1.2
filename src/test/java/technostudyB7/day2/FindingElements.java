package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        //set up the browser driver (Selenium gonna knock the door of browser driver (chrome driver))
        WebDriverManager.chromedriver().setup();

        //to open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techno.study");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        //get() method wait the page for loading , navigate().to() method does not wait for the page to load

        driver.navigate().forward();

        //finding the webelement on facebook page (Connect with friends and the world around you on Facebook.)
       WebElement  sloganText=driver.findElement(By.className("_8eso"));

       String expSloganText = "Connect with friends and the world around you on Facebook.";
       String actSloganText =sloganText.getText();

       if (expSloganText.equals(actSloganText)){
           System.out.println("verification is done : PASS");
       } else {
           System.out.println("verification is failed");
           System.out.println("actual slogan text is : "+actSloganText);
       }



    }
}
