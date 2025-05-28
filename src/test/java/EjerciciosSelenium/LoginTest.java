package EjerciciosSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        WebElement usertxt=driver.findElement(By.xpath("//input[@id='inputUsername']"));
        WebElement pwdtxt=driver.findElement(By.xpath("//input[@name='inputPassword']"));
        WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Sign In']"));


        //Testeo con datos correctos y mensaje de exito
       /* usertxt.sendKeys("Ayelen");
        Thread.sleep(1000);
        pwdtxt.sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        loginbtn.click();
        Thread.sleep(2000);

        WebElement successtxt=driver.findElement(By.xpath("//h1"));
        System.out.println(successtxt.getText());
        */

        //Testeo con datos incorrectos y mensaje de error
        usertxt.sendKeys("Ayelen");
        Thread.sleep(1000);
        pwdtxt.sendKeys("rahulshetty");
        Thread.sleep(1000);
        loginbtn.click();
        Thread.sleep(4000);

        WebElement errortxt=driver.findElement(By.xpath(" //p[@class='error']"));
        System.out.println(errortxt.getText());

        Thread.sleep(3000);
        driver.quit();



    }
}
