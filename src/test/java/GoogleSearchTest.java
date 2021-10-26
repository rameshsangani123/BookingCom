/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 12244
 */
public class GoogleSearchTest {
    
    public GoogleSearchTest() {
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
        
        //driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //@Test
   // public void hello() {}
    
    @Test
    public void testSearch(){
        
        driver.get("http://www.google.com");
        
        WebElement e=driver.findElement(By.name("q"));
        
        e.sendKeys("Selenium jobs");
        e.submit();
        // verify page title contains selenium jobs
        assertTrue(driver.getTitle().contains("Selenium jobs"));
          
    }
    
    @Test
        public void testNavifation(){
            driver.navigate().to("http://www.google.com");
            driver.navigate().to("http://www.microsoft.com");
            
            driver.navigate().back(); // Load google page
            driver.navigate().forward(); // Load Microsoft page
            driver.navigate().refresh();
}
    @Test
    public void testScreenshot() throws IOException{
        
        driver.get("http://www.ibm.com");
        
       File myfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       System.out.println(myfile.getAbsolutePath());        
        FileUtils.copyFile(myfile, new File("C:\\qa\\myfile.png"));
    }
        
    }

