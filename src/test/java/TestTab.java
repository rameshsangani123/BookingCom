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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 12244
 */
public class TestTab {
    
    public TestTab() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   private WebDriver driver;
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    
    public void testTabs(){
        ((JavascriptExecutor)driver).executeScript("wincow.open()");
       ArrayList list= new ArrayList(driver.getWindowHandles());
       driver.switchTo().window((string)list.get(0));
       driver.get("http://www.google.com");
       
       driver.switchTo().window((string)list.get(1));
       driver.get("http://www.ibm.com");
       
    }
}

