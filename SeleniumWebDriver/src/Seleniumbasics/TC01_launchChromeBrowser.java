package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_launchChromeBrowser {

    public static void main(String[] args) throws InterruptedException{

        //browser driver exe
        System.setProperty("web-driver.chrome.driver","C:\\Users\\DELL\\Desktop\\Daniel\\SeleniumWebDriver\\chromedriver.exe");

        //Create chrome instance
        WebDriver driver=new ChromeDriver();

        //Open application
        driver.get("https://the-internet.herokuapp.com/");

        //maximize browser
        driver.manage().window().maximize();

        //wait 10 sec
        Thread.sleep( 10000);

        //close browser
        //driver.close(); // close the current tab
        driver.quit(); // close all the tab




    }

}
