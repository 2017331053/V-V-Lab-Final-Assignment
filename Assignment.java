
 package lab.assignment;
 import io.github.bonigarcia.wdm.WebDriverManager;
 import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;
 
 public class TestAutomation {
 
     public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         Thread.sleep(1000);
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         Thread.sleep(2000);
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         Thread.sleep(2000);
         driver.findElement(By.id("login-button")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
         Thread.sleep(3000);
         driver.findElement(By.linkText("2")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("checkout")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("first-name")).sendKeys("Abdus");
         Thread.sleep(3000);
         driver.findElement(By.id("last-name")).sendKeys("Salam");
         Thread.sleep(3000);
         driver.findElement(By.id("postal-code")).sendKeys("Postal Code");
         Thread.sleep(3000);
         driver.findElement(By.id("continue")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("finish")).click();
     }
 }