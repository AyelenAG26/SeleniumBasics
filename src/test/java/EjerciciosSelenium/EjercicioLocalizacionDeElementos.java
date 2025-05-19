package EjerciciosSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EjercicioLocalizacionDeElementos {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //ID
        WebElement Button1 = driver.findElement(By.id("openwindow"));
        WebElement Button2 = driver.findElement(By.id("opentab"));
        WebElement Button3 = driver.findElement(By.id("alertbtn"));
        WebElement Button4 = driver.findElement(By.id("confirmbtn"));
        WebElement Button5 = driver.findElement(By.id("hidetext-box"));
        WebElement Button6 = driver.findElement(By.id("showtext-box"));
        WebElement textname = driver.findElement(By.id("name"));
        WebElement hidetext = driver.findElement(By.id("displayed-text"));

        //Elementos por NAME
        WebElement textnameN = driver.findElement(By.name("enter-name"));
        WebElement hidetextN = driver.findElement(By.name("show-hide"));

        //Classname
        WebElement radiobutton = driver.findElement(By.className("radioButton"));

        //LinkText
        WebElement texto1 = driver.findElement(By.linkText("QA Meetup with Rahul Shetty @Pune - Limited Seats! Book Now!"));
        WebElement texto2 = driver.findElement(By.partialLinkText("QA Meetup"));
        WebElement texto3 = driver.findElement(By.linkText("REST API"));
        WebElement texto4 = driver.findElement(By.linkText("Broken Link"));








    }
}
