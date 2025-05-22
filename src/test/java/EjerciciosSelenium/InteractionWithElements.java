package EjerciciosSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InteractionWithElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize(); //maximiza la pantalla del navegador
/*
        //Interactuar con elemento
        //driver.findElement(By.id("show-textbox")).click()
        WebElement btn1=driver.findElement(By.id("show-textbox"));

        //Dar click variaas veces al mismo voton
        WebElement btn2=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        btn1.click();
        Thread.sleep(500);
        btn2.click();
        Thread.sleep(500);
        btn1.click();
        Thread.sleep(500);
        btn2.click();

        Thread.sleep(1000);
        //Llenar campos de texto
        WebElement txt1=driver.findElement(By.id("autocomplete")); //identificamos el elementos
        txt1.sendKeys("MEXICO");

        Thread.sleep(1000);
        WebElement txt2=driver.findElement(By.xpath("//input[@id='name']")); //identificamos el elementos
        txt2.sendKeys("Ayelen");



        /*
        //Manejo popup
        WebElement btnAlert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        btnAlert.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); //acepta y cierra elpopup
        Thread.sleep(1000);

        //Declinar el popup
        WebElement btnConfirm =driver.findElement(By.xpath("//input[@id='confirmbtn']"));
        btnConfirm.click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss(); //acepta y cierra elpopu

        //tomar el texto de la alerta
        Thread.sleep(1000);
        WebElement txt2=driver.findElement(By.xpath("//input[@id='name']")); //identificamos el elementos
        txt2.sendKeys("Ayelen");

        System.out.println(driver.switchTo().alert().getText());

        //manejo de dropdowns

        WebElement dropdown1= driver.findElement(By.id("dropdown-class-example"));
        Select select=new Select(dropdown1);

        Thread.sleep(1000);

        //Para seledccionar el valor hay 3 maneras.
        //Por index (posicion de la opcion)
        select .selectByIndex(0);
        Thread.sleep(1000);
        select.selectByValue("option3");
        Thread.sleep(1000);
        select.selectByVisibleText("Option2");

        Thread.sleep(1000);





 //uso de las clase ACTION
        WebElement mousebtn= driver.findElement(By.id("mousehover"));
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        //hacer el hover
        WebElement text=driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
        act.moveToElement(text).perform();
        Thread.sleep(1000);


        act.moveToElement(mousebtn).contextClick(mousebtn).build().perform();

        //Thread.sleep(1000);
        //dar click
       // act.contextClick(mousebtn).perform(); //da clic derecho sobre el elemento


        */

        //udo del findElementsSSS
        //uso de tablas para filtrados usando los encabezados

        List<WebElement> encabezados = driver.findElements(By.xpath("//table[@name='courses']//th"));

        /*for(int x=0; x<encabezados.size();x++){
            System.out.println(encabezados.get(x).getText());
        }*/

        for(WebElement encabezado:encabezados){
            System.out.println(encabezado.getText());
        }


        //Tarea
        //dar clic a todos los datio buttons y seleccionar los chackbox uno por uno y despues deseleccionarlos
        //usar el isselected y que mande si esta en true false
        //atrayendolos como una lista de elementos
        //buscar un xpath en comun en lugar de gettext es un clic o isselected
        //tarea en una clase nueva





        Thread.sleep(3000); //da 5 segundos en la pantalla
        driver.quit(); //Cierra todas por completo el navegador
    }
}
