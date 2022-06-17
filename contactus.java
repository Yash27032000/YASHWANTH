package automobile.mobileapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class contactus extends launching {
@Test(priority = 4)
public void contactUs() throws Throwable
{
driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
driver.findElement(By.linkText("Contact Us")).click();
Set<String> window = driver.getWindowHandles();
List<String> list= new ArrayList<String>(window);
driver.switchTo().window(list.get(1));
Thread.sleep(1000);
System.out.println(driver.getTitle());
WebElement x = driver.findElement(By.cssSelector("h3[class='title']"));
Assert.assertTrue(x.isDisplayed());
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,550)");
driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("abc");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("123456");
driver.findElement(By.xpath("//*[@name='message']")).sendKeys("abcdefghijkl");
driver.findElement(By.xpath("//*[@type='submit']")).click();
driver.switchTo().window(list.get(0));
Thread.sleep(2000);
System.out.println(driver.getTitle());
String ele4 = driver.getTitle();
if(ele4.equals("Mobile"))
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
}