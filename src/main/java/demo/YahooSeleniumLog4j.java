package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSeleniumLog4j {
    WebDriver driver;
    String firstName = "Alex";
    String lastName = "Vuong";
    String userID = "LetsAGoMario";
    String password = "420pass123";
    String birthYear = "1999";

    static Logger logger = LogManager.getLogger(Log4jDemo.class);
    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vuong\\Documents\\JAR Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yahoo.com/");

        logger.info("Open Yahoo");
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
    }

    @Test
    public void createAccountTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div/div[3]/div/div[3]/div[1]/div/a")).click();
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[4]/p/a")).click();
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        logger.info("Enter first name");

        driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        logger.info("Enter last name");

        driver.findElement(By.id("usernamereg-userId")).sendKeys(userID);
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        logger.info("Enter userID");

        driver.findElement(By.id("usernamereg-password")).sendKeys(password);
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        logger.info("Enter password");

        driver.findElement(By.id("usernamereg-birthYear")).sendKeys(birthYear);
        logger.warn("Thread Sleep: 2000");
        Thread.sleep(2000);
        logger.info("Enter birth year");

        driver.findElement(By.id("reg-submit-button")).click();
        logger.info("Click continue");
    }
}
