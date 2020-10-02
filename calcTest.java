package calcTest;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class calcTest {
	
	@Test
	public void testAddition()
	{

		System.setProperty("webdriver.chrome.driver","/Users/JayVelazco/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webstrar99.fulton.asu.edu/page2/");

		//set the first number
		WebElement element = driver.findElement(By.name("number1"));
		element.sendKeys("1");

		//set the second number
		element = driver.findElement(By.name("number2"));
		element.sendKeys("1");

		//find and click the add button
		element = driver.findElement(By.name("add"));
		element.click();

		//find and click the calculate button
		element = driver.findElement(By.name("calc"));
		element.click();

		//find and store the result value
		element = driver.findElement(By.name("res"));
		String result = element.getAttribute("value");

		element.submit();
		
		//System.out.println(result);

		assertEquals("2",result);
		driver.quit();
		//driver.close();
	}
	@Test
	public void testSubtraction()
	{

		System.setProperty("webdriver.chrome.driver","/Users/JayVelazco/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webstrar99.fulton.asu.edu/page2/");

		//set the first number
		WebElement element = driver.findElement(By.name("number1"));
		element.sendKeys("1");

		//set the second number
		element = driver.findElement(By.name("number2"));
		element.sendKeys("1");

		//find and click the sub button
		element = driver.findElement(By.name("sub"));
		element.click();

		//find and click the calculate button
		element = driver.findElement(By.name("calc"));
		element.click();

		//find and store the result value
		element = driver.findElement(By.name("res"));
		String result = element.getAttribute("value");

		element.submit();
		
		//System.out.println(result);

		assertEquals("0",result);
		driver.quit();
		//driver.close();
	}
	@Test
	public void testMultiplication()
	{

		System.setProperty("webdriver.chrome.driver","/Users/JayVelazco/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webstrar99.fulton.asu.edu/page2/");

		//set the first number
		WebElement element = driver.findElement(By.name("number1"));
		element.sendKeys("2");

		//set the second number
		element = driver.findElement(By.name("number2"));
		element.sendKeys("1");

		//find and click the mul button
		element = driver.findElement(By.name("mul"));
		element.click();

		//find and click the calculate button
		element = driver.findElement(By.name("calc"));
		element.click();

		//find and store the result value
		element = driver.findElement(By.name("res"));
		String result = element.getAttribute("value");

		element.submit();
		
		//System.out.println(result);

		assertEquals("2",result);
		driver.quit();
		//driver.close();
	}
	@Test
	public void testDivision()
	{

		System.setProperty("webdriver.chrome.driver","/Users/JayVelazco/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webstrar99.fulton.asu.edu/page2/");

		//set the first number
		WebElement element = driver.findElement(By.name("number1"));
		element.sendKeys("2");

		//set the second number
		element = driver.findElement(By.name("number2"));
		element.sendKeys("1");

		//find and click the div button
		element = driver.findElement(By.name("div"));
		element.click();

		//find and click the calculate button
		element = driver.findElement(By.name("calc"));
		element.click();

		//find and store the result value
		element = driver.findElement(By.name("res"));
		String result = element.getAttribute("value");

		element.submit();
		
		//System.out.println(result);

		assertEquals("2",result);
		driver.quit();
		//driver.close();
	}

}


