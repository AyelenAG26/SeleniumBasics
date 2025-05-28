package EjerciciosSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TesteoCucumber {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        WebElement donebtn=driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]/../div/button"));
        WebElement countxt=driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]/../div[@class='stepper-input']/input"));
        WebElement addbtn=driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]/../div[@class='stepper-input']/a[@class='increment']"));

        addbtn.click();
        Thread.sleep(1000);
        addbtn.click();
        Thread.sleep(1000);
        addbtn.click();
        Thread.sleep(2000);
        donebtn.click();

        System.out.println("Agrego : "+countxt.getText()+ "productos");

        Thread.sleep(3000);
        driver.quit();

    }

}
