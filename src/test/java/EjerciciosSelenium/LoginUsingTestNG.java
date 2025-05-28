package EjerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginUsingTestNG {
    @Test
    public void loginwithValidCredentials(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //buscar elememntos
        WebElement usertxt=driver.findElement(By.xpath("//input[@id='inputUsername']"));
        WebElement pwdtxt=driver.findElement(By.xpath("//input[@name='inputPassword']"));
        WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
        //ingresar datos
        usertxt.sendKeys("Ayelen");

        pwdtxt.sendKeys("rahulshettyacademy");

        loginbtn.click();

        //Espera explicita: esperando a que aparezca el boton de log out
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='logout-btn']")));

        WebElement successtxt=driver.findElement(By.xpath("//h1"));
        System.out.println(successtxt.getText());

        driver.quit();
    }

    @Test
    public void loginwithInvalidCredentials() {
        WebDriver driver = new ChromeDriver();
        //Espera global: espera 10 segundos antes de fallar MAXIMO
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //buscar elememntos
        WebElement usertxt=driver.findElement(By.xpath("//input[@id='inputUsername']"));
        WebElement pwdtxt=driver.findElement(By.xpath("//input[@name='inputPassword']"));
        WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
        //ingresar datos
        usertxt.sendKeys("Ayelen");

        pwdtxt.sendKeys("rahulshetty");

        loginbtn.click();

        //buscar mensaje de error
        WebElement errortxt=driver.findElement(By.xpath(" //p[@class='error']"));
        System.out.println(errortxt.getText());

        driver.quit();
    }


}
