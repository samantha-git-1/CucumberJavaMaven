package com.co.project.app.StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.co.project.app.Pages.A001_LoginPage;

import io.cucumber.java.en.*;

public class A001_02_LoginFunctionality_Steps {
	
	WebDriver driver = null;
	//A001_LoginPage loginPage = new A001_LoginPage(driver);

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(); // Launch Chrome browser
		Thread.sleep(1000);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Thread.sleep(4000);
	}

	@When("user enters Username and Password")
	public void user_enters_username_and_password() throws InterruptedException {
		//loginPage.enterUsername("admin");
		//loginPage.enterPassword("admin123");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		driver.findElement(
				By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
	}

	@Then("user is navigated to the landing page")
	public void user_is_navigated_to_the_landing_page() throws InterruptedException {
		driver.findElement(By.xpath("//h5[.='Employee Information']")).isDisplayed();
		Thread.sleep(3000);
		System.out.println("h5 'Employee Information' is present.");
		driver.close();
	}

}
