package EjerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize(); //maximiza la pantalla del navegador
    }

    @Test
    public void asserExample(){
        String titulo=driver.getTitle();
        Assert.assertEquals(titulo,"Practice Page");
    }
    //HARD ASSERTS
    //LOS FALLOS SON CRITICOS, NO CONTINUA LAS PRUEBAS SI LA ANTERIOR NO PASO
    @Test
    public void asserTrueExample(){
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='option1']"));
        checkbox.click();
        Boolean check=checkbox.isSelected();
        Assert.assertTrue(check);
    }
    @Test
    public void assertFalseExample(){
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='option1']"));
        Boolean check=checkbox.isSelected();
        Assert.assertFalse(check);
    }

    //SOFT ASSERTS
    //PRUEBAS NO CRITICAS, REALIZA TODAS LAS PRUEBAS HASTA EL FINAL AUNQUE LAS PRIMERAS HAYAN FALLADO

    @Test
    public void softAssertExample(){
        //verifica que el titulo sea correcto
        SoftAssert sa=new SoftAssert();
        String title=driver.getTitle();
        sa.assertEquals(title,"Rahul shetty");

        //verifica que el check este selecciionado
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='option1']"));
        sa.assertTrue(checkbox.isSelected()); //no esta seleccionado

        //dar clic
        checkbox.click();

        //verifica que el check NO este seleccionado
        sa.assertFalse(checkbox.isSelected());

        //IMPORTANTE
        sa.assertAll();

    }
    @AfterMethod
    public void terminar(){
        driver.quit();
    }

}
