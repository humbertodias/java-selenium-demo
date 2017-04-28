package htmldriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;

import com.sun.jna.Platform;

public class PhantomJSTest {
    
    public static String getPathPhantomJS(){
        return Platform.isWindows() 
               ? "C:\\dev\\utils\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe" 
               : "/usr/local/bin/phantomjs";
    }

    public static void main(String ... args) {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, getPathPhantomJS() );

        // Creating a new instance of the HTML unit driver
        WebDriver driver = new PhantomJSDriver(caps);
        
        // Navigate to Google
        driver.get("http://www.google.com");

        // Locate the searchbox using its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter a search query
        element.sendKeys("O que procuro");

        // Submit the query. Webdriver searches for the form using the text input element automatically
        // No need to locate/find the submit button
        element.submit();

        // This code will print the page title
        System.out.println("Page title is: " + driver.getTitle());

        driver.close();
        driver.quit();
    }

}