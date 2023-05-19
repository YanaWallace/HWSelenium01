package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver=new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();

            driver.findElement(By.id("customer.firstName")).sendKeys("Yana");

            driver.findElement(By.id("customer.lastName")).sendKeys("Wallace");

            driver.findElement(By.id("customer.address.street")).sendKeys("493 Chelsea Dr");

            driver.findElement(By.id("customer.address.city")).sendKeys("Henderson");

            driver.findElement(By.id("customer.address.state")).sendKeys("NV");

            driver.findElement(By.id("customer.address.zipCode")).sendKeys("89014");

            driver.findElement(By.id("customer.phoneNumber")).sendKeys("7023379659");

            driver.findElement(By.id("customer.ssn")).sendKeys("999-88-9999");

            driver.findElement(By.id("customer.username")).sendKeys("Yaya999");
            driver.findElement(By.id("customer.password")).sendKeys("Yaya8989");
            driver.findElement(By.id("repeatedPassword")).sendKeys("Yaya8989");
            Thread.sleep(5000);
            driver.quit();



        }

    }




