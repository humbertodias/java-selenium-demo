package htmldriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import com.sun.jna.Platform;

public class PhantomJSTest {
    public static void main(String[] args) {
        String phantonPath = Platform.isWindows() 
        ? "C:\\dev\\utils\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe" 
        : "/usr/local/bin/phantomjs";
        System.setProperty("phantomjs.binary.path", new File(phantonPath).getAbsolutePath());
        PhantomJSDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("O que procuro");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

}