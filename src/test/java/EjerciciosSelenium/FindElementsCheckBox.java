package EjerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsCheckBox {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize(); //maximiza la pantalla del navegador

        //radiobutton
        List<WebElement> rbtn = driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement btn1 : rbtn) {
            System.out.println(btn1.isSelected()); //estado inicial
            btn1.click();
            Thread.sleep(500);
            System.out.println(btn1.isSelected()); //estado despues del clic
        }

        //checkbox
        List<WebElement> cbtn = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement btn2 : cbtn) {
            System.out.println(btn2.isSelected()); //estado inicial
            btn2.click();
            Thread.sleep(500);
            System.out.println(btn2.isSelected()); //estado despues del clic
            btn2.click(); //deselecciona
            Thread.sleep(500);
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
