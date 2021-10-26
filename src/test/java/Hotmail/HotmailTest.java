/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotmail;

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

/**
 *
 * @author 12244
 */
public class HotmailTest {
    
    public HotmailTest() {
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
        
    } 
    
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLogin() throws InterruptedException{
        driver.get("http://www.hotmail.com");
    WebElement e=driver.findElement(By.partialLinkText("Sign in"));
    e.click();
    
    e=driver.findElement(By.id("i0116"));
    
    e.clear();
    
    e.sendKeys("Selsample@hotmail.com");
    
    e=driver.findElement(By.id("idSIButton9"));
    e.click();
    Thread.sleep(3000);
    
    e=driver.findElement(By.id("i0118"));
    e.sendKeys("Sel@123!");
    
    //e=driver.findElement(By.id("idSIButton9"));
    //e.click();
    e.submit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
