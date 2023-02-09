package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //https://www.google.com/

        driver.get("https://www.google.com/");

        //bamboo pen - Google Search

        //1- go to google page
        //2- locate search box
        //3- send bamboo pen keys to the box
        //4- get the title of the new opened page
        //5- do verification with actual one and expected one

        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text"
        // aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off"
        // autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value=""
        // aria-label="Search" data-ved="0ahUKEwiXw-7Cn4f9AhVQk4kEHQ8-Ce8Q39UDCAc">
        String input = "bamboo pen";
       WebElement searchBox =driver.findElement(By.name("q"));
       searchBox.sendKeys(input+ Keys.ENTER);

       //Verification

        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification is DONE : PASS");
        }
        else {
            System.out.println("verification is FAILED");
            System.out.println("Actual Title is : "+actualTitle);
        }




    }
}
