package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
    //<select class="form-control" id="select-demo">
    //				<option value="" selected="" disabled="">Please select</option>
    //				 <option value="Sunday">Sunday</option>
    //				  <option value="Monday">Monday</option>
    //				  <option value="Tuesday">Tuesday</option>
    //				  <option value="Wednesday">Wednesday</option>
    //				  <option value="Thursday">Thursday</option>
    //				  <option value="Friday">Friday</option>
    //				  <option value="Saturday">Saturday</option>
    //			  </select>

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement dropDown = driver.findElement(By.id("select-demo"));

        //create Select class object
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("Tuesday");
        Thread.sleep(1000);
        select.selectByVisibleText("Saturday");


        String selectedOption = select.getFirstSelectedOption().getText();
        String expected = "Saturday";

        if(selectedOption.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }




    }
}
