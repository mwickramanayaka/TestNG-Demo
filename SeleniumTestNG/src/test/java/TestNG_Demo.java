import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

	String expectedTitleikman ="ikman.lk - Electronics, Cars, Property and Jobs in Sri Lanka";
	private static WebDriver driver = null;
	
	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	@Test
	public void test() {

		driver.manage().window().maximize();
		driver.get("https://ikman.lk/");

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitleikman);
		
		System.out.println();

	}

	@AfterTest
	public void tearDownTest() {

		driver.close();

	}
}
