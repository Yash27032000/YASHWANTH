package automobile.mobileapp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class order extends launching
{
@Test(priority = 2)
public void search() throws InterruptedException
{
driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
WebElement ele = driver.findElement(By.xpath("//b[.='All Mobile Details']"));
Assert.assertTrue(ele.isDisplayed());
driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13");
Thread.sleep(2000);
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,700)");
Assert.assertTrue(driver.findElement(By.xpath("//h2[.='Our New Feature Courses']")).isDisplayed());
driver.findElement(By.xpath("(//a[.='Order'])[4]")).click();
}
@Test(priority = 3)
public void Order() throws InterruptedException, Exception
{
Set<String> window = driver.getWindowHandles();
Iterator<String>it = window.iterator();
Thread.sleep(2000);
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
driver.findElement(By.id("inputFirstName")).sendKeys("abc");
driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("xyz");
driver.findElement(By.id("inputEmail")).sendKeys("abc@gmail.com");
driver.findElement(By.id("inputPassword")).sendKeys("abc@123");
driver.findElement(By.id("flexRadioDefault1")).click();
driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("87654322");
driver.findElement(By.id(" address1")).sendKeys("lkjhfrtydcvv");
driver.findElement(By.id("address2")).sendKeys("nbgcvs");
driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
WebElement dropdown = driver.findElement(By.id("inputState"));
Select a= new Select(dropdown);
a.selectByVisibleText("Karnataka");
driver.findElement(By.id("inputZip")).sendKeys("12345");
driver.findElement(By.xpath("//*[.='Apple']")).click();
driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("2");
WebElement dpdwn2 = driver.findElement(By.id("bought"));
Select b= new Select(dpdwn2);
b.selectByValue("0");
driver.findElement(By.xpath("//*[@id='gridCheck1']")).click();
driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Robot r=new Robot();
for(int i=0;i<2;i++)
{
r.keyPress(KeyEvent.VK_TAB);
}
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
}
}