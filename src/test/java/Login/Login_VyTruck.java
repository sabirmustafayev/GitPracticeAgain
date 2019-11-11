package Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_VyTruck {
    public static void main(String[] args) throws Throwable {

        //
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver driverObj = new FirefoxDriver();

        WebDriverManager.chromedriver().setup();
        ChromeDriver driverObj = new ChromeDriver();
//go to url
        driverObj.navigate().to("https://qa2.vytrack.com/user/login");
        Thread.sleep(3000);
// creating userName object
        WebElement userName = driverObj.findElement(By.id("prependedInput"));
        userName.sendKeys("storemanager244");
//creating passWord object
        WebElement passWord = driverObj.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123");
//creating clickButton object
        WebElement clickButton = driverObj.findElement(By.id("_submit"));
        clickButton.click();

        String expectedTitle = "Dashboard";
        String actualTitle = driverObj.getTitle();
        System.out.println("Expected tile is "+expectedTitle);
        System.out.println("Actual title is "+actualTitle);



        if (expectedTitle == actualTitle){
            System.out.println("Test failed");
        }else
            System.out.println("Test passed");

        driverObj.close();
    }
}
