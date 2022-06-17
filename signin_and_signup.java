
package automobile.mobileapp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class signin_and_signup extends launching{
@Test(dependsOnMethods= {"Lanching_the_Browser"})
public void Sigup_for_mobiles() throws InterruptedException {
WebElement Signin = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
Signin.click();
WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
Signup.click();
WebElement firstname = driver.findElement(By.xpath("//input[@id='myName']"));
firstname.sendKeys("abc");
WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
Last_name.sendKeys("xyz");
WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
Email.sendKeys("abc@gmail.com");
WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
password.sendKeys("abc@123");
WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
Phone_number.sendKeys("9865432716");
driver.findElement(By.xpath("//input[@type='radio']")).click();
WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
bio_story.sendKeys("automation assessment");
driver.findElement(By.xpath("//input[@type='date']")).click();
driver.findElement(By.xpath("//button[@type='Submit']")).click();
Alert Al = driver.switchTo().alert();
Al.accept();
Thread.sleep(2000);
WebElement user_name = driver.findElement(By.id("username"));
user_name.click();
user_name.sendKeys("abc@gmail.com");
WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
Password.click();
Password.sendKeys("abc@123");
driver.findElement(By.xpath("//a[text()='Log In']")).click();
Thread.sleep(1000);
}
}

