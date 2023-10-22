package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePage {


    public  WebDriver driver;
    public String textToSearch = "Please, consider hiring me.";

    public GooglePage() {
        driver = new ChromeDriver();
    }

    public static WebDriverWait waitingStrategy(Long time, WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return webDriverWait;
    }

    public  void openWebsite(String url){
        driver.get(url);
    }

    public WebElement findElement(String findBy){
        return driver.findElement(By.cssSelector(findBy));
    }

    public  void clickDecline(){
        waitingStrategy(5L,driver);
        WebElement declineButton = findElement("[id='W0wltc']");
        declineButton.click();
    }

    public  void fillSearchField(){
        waitingStrategy(5L,driver);
        WebElement searchField = findElement("[id='APjFqb']");
        searchField.sendKeys(textToSearch);
    }

}
