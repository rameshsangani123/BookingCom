/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author 12244
 */
public class UserprofileTest {
    
    public UserprofileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    WebDriver driver;
    @Before
    public void setUp() {
        
        // initialise chrome driver
        
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\chromedriver.exe");
        
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
        
    } 
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testUserform(){
        
        driver.get("https://nlilaramani.github.io/userprofile.html");
        
        
        WebDriverWait wait=new WebDriverWait(driver,15);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fname']));
        
        driver.findElement(By.id("fname")).sendKeys("Naren");
        
        driver.findElement(By.name("lname")).sendKeys("Lilaramani");
        
         driver.findElement(By.id("username")).sendKeys("testuser");
         
         driver.findElement(By.name("password")).sendKeys("thisissecret");
         
         driver.findElements(By.name("g")).get(0).click();
         
         //driver.findElements(By.name("g")).get(1).click();
         
         WebElement e=driver.findElement(By.tagName("select"));
         
         e.sendKeys("Bachelors");
         Select s= new Select(e);
         
         s.selectByIndex(1);
         
         driver.findElements(By.tagName("input")).get(6).click();
         
         driver.findElement(By.xpath("textarea")).sendKeys("Some Comments");
         e.submit();
         
         
    }
    
    @Test
    public void testUserprofileWithXpath(){
        
        driver.get("https://nlilaramani.github.io/userprofile.html");
        
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Naren");
        
        driver.findElement(By.xpath("//input[@name='lname')")).sendKeys("Lilaramani");
        
         driver.findElement(By.id("username")).sendKeys("testuser");
         
         driver.findElement(By.name("password")).sendKeys("thisissecret");
         
         driver.findElement(By.xpath("//input[@name='g'][1]")).click();
         
         //driver.findElements(By.name("g")).get(1).click();
         
         WebElement e=driver.findElement(By.tagName("select"));
         
         e.sendKeys("Bachelors");
         Select s= new Select(e);
         
         s.selectByIndex(1);
         
         driver.findElements(By.tagName("input")).get(6).click();
         
         driver.findElement(By.xpath("textarea")).sendKeys("Some Comments");
         //e.submit()
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
