/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingCom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 12244
 */
public class BookingCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver", "C:\\Users\\12244\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
        String u=driver.getCurrentUrl();
    }
    
}
