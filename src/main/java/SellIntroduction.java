import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {
    public static void main(String[] args){
        //Invoiking Browser
        //Chrome - ChromeDriver -> Methods
        //WebDriver methods + Class Methods belogn to ChromeDriver Class
        //ChromeDriver driver = new ChromeDriver();
        // chromedriver.exe --> Chrome Browser
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.chrome.driver","/Users/7004553/Documents/QE2023/chromedriver");
         WebDriver driver = new ChromeDriver(chromeOption);
        //Firefox
        //WebDriver driver = new FirefoxDriver();
        //Microsoft Edge
        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.mamtech.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // driver.close();
        driver.quit();
    }
}
