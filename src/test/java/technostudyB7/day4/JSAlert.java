package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

//        //<button onclick="jsAlert()">Click for JS Alert</button>
//        WebElement jsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        jsAlert.click();
//          //it will give me the text of Alert message
//      String jsAlertText=driver.switchTo().alert().getText();
//        System.out.println(jsAlertText);
//
//
//        //it will click on OK button
//        driver.switchTo().alert().accept();

//        //<button onclick="jsConfirm()">Click for JS Confirm</button>
//        WebElement jsConfirm=driver.findElement(By.cssSelector("button[onclick ='jsConfirm()'] "));
//        jsConfirm.click();
//
//       String textJSConfirm= driver.switchTo().alert().getText();
//        System.out.println(textJSConfirm);
//
//        driver.switchTo().alert().dismiss();

        //<button onclick="jsPrompt()">Click for JS Prompt</button>

        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();

        driver.switchTo().alert().sendKeys("Mustafa Yilmaz");
        driver.switchTo().alert().accept();







    }

}
