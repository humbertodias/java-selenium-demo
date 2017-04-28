package htmldriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
    public static void main(String[] args) {
        File phantomBin = new File("C:\\dev\\utils\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        System.setProperty("phantomjs.binary.path", phantomBin.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("O que procuro");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

}