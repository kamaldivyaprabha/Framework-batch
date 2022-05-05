package com.selenium;

public class Methods {

	package com.keyword;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ActionsKeyword {

		static WebDriver driver;


		//openBrowser
		public static void openBrowser() {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		//goToUrl
		public static void goToUrl() {

			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();

		}

		//enterUserName
		public static void enterUsername() {

			WebElement findElement = driver.findElement(By.id("txtUsername"));

			findElement.sendKeys("Admin");
		}

		//enterPassword
		public static void enterPassword() {

			WebElement findElement2 = driver.findElement(By.id("txtPassword"));

			findElement2.sendKeys("admin123");
		}
		//clickLogin

		public static void clickLogin() {

			driver.findElement(By.id("btnLogin")).click();
		}


		public static void clickDirectory() throws Exception {
			Thread.sleep(3000);
			WebElement findElement3 = driver.findElement(By.id("menu_directory_viewDirectory"));
			findElement3.click();
		}

		public static void selectQALead(){


			WebElement findElement4 = driver.findElement(By.id("searchDirectory_job_title"));


			Select select = new Select(findElement4);
			select.selectByVisibleText("QA Lead");
		}

		public static void clcikSearch() {

			driver.findElement(By.id("searchBtn")).click();
		}

	}



















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
