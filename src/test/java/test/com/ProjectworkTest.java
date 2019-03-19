
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
*
* @author Scott
*/

public class ProjectworkTest {
    
    private WebDriver driver;
    
    public ProjectworkTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUp() {
        
     System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
     ChromeOptions chromeOptions= new ChromeOptions();
     chromeOptions.setBinary("C:\\Users\\thest\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
     driver = new ChromeDriver(chromeOptions);
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }    
  
    @Test
    public void testItexpsNavigation() throws Exception {
        driver.get("https://www.itexps.net/");
        Thread.sleep(5000);
        // The following will traverse the ITEXPS Page Tabs and Login
        driver.findElement(By.id("DrpDwnMn00label")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn01label")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn02label")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn03label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn04label\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn05label\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn06label\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn00label\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("thestorm10@sbcglobal.net");
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys("Band1t-Boy");
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"DrpDwnMn05label\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
    }

@Test
   public void testLogin() throws Exception {
        driver.get("https://www.itexps.net/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"signUpDialogswitchDialogLink\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).click();      
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("thestorm10@sbcglobal.net");
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys("Band1t-Boy");
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn05label")).click();
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
    }
    
@Test
  public void testLoginFail() throws Exception {
         driver.get("https://www.itexps.net/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"iew9cwvzactionTitle\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"signUpDialogswitchDialogLink\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).click();      
        driver.findElement(By.xpath("//*[@id=\"memberLoginDialogemailInputinput\"]")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("example123@hotmail.com");
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).click();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys("test123");
        driver.findElement(By.id("memberLoginDialogokButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("DrpDwnMn05label")).click();
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
    }
           
@Test
    public void testSignupExists() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        Thread.sleep(2000);     // Using sleep() to allow Page to download and sync-up before continuing.
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("signUpDialogemailInputinput")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"signUpDialogemailInputinput\"]")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("signUpDialogemailInputinput")).sendKeys("thestorm10@sbcglobal.net");
        driver.findElement(By.id("signUpDialogpasswordInputinput")).click();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).clear();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).sendKeys("Band1t-Boy");
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogokButton")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("thestorm10@sbcglobal.net");
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).clear();
        driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys("Band1t-Boy");
        driver.findElement(By.id("memberLoginDialogokButton")).click();
    }
    

@Test
    public void testSignupNew() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        Thread.sleep(5000);     // Using sleep() to allow Page to download and sync-up before continuing.
        driver.findElement(By.id("iew9cwvzactionTitle")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("signUpDialogemailInputinput")).click();
        driver.findElement(By.xpath("//*[@id=\"signUpDialogemailInputinput\"]")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("signUpDialogemailInputinput")).sendKeys("helloworld2@hotmail.com");
        driver.findElement(By.id("signUpDialogpasswordInputinput")).click();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).clear();
        driver.findElement(By.id("signUpDialogpasswordInputinput")).sendKeys("test123");    
        Thread.sleep(4000);
        driver.findElement(By.id("signUpDialogokButton")).click();
        Thread.sleep(4000);

    }
  
@Test
    public void testAppoint2() throws Exception {
        driver.get("https://www.google.com/search?source=hp&ei=a2eIXJC4BIOUjwTnv7uYCQ&q=itexps&btnK=Google+Search&oq=itexps&gs_l=psy-ab.3..35i39j38.6127.8449..9669...2.0..0.130.506.6j1......0....1..gws-wiz.....6..0i131j0j0i10.S4RZNq7asjE#btnK=Google%20Search");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1] | ]]
        driver.findElement(By.id("DrpDwnMn06label")).click();
        Thread.sleep(3000);
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Free Appointment'])[1]/following::button[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::div[6]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.findElement(By.linkText("Give us your feedback")).click();
        Thread.sleep(5000);
    }
   
//@Test
    public void testAppointment() throws Exception {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("itexps");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
        driver.findElement(By.id("DrpDwnMn06label")).click();
        //driver.findElement(By.xpath("//*[@id=\"DrpDwnMn06label\"]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Free Appointment'])[1]/following::button[1]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
        driver.findElement(By.linkText("Give us your feedback")).click();
    }
  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
