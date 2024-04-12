package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.runtime.Runtime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class amazon_main {
	WebDriver driver;
	@Given("user in home page")
	public void userHomepage() {
		System.setProperty("webdriver.chrome.driver","D:\\CD2\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@When("user clicks on signin")
	public void checkSignin() {
		WebElement p=driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		p.click();

	}
	@Then("user enters details and continue")
	public void signinDetails(){
		WebElement user=driver.findElement(By.xpath("//input[@id='ap_email']"));
		user.sendKeys("swethassivasankaran@gmail.com");
		user.submit();
		WebElement pwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
		pwd.sendKeys("Swetha123#");
		pwd.submit();		
	}
	@And("user in cart page")
	public void userCartpage() {
		WebElement p=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		p.click();
	}
	@And("user in products page")
	public void homePage() {
		WebElement p=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		p.click();
	}
	@Then("user search macbook pro")
	public void chooseProductMac() {
		WebElement usersearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		usersearch.sendKeys("Macbook pro");
		usersearch.submit();
	}
	@And("user add available item")
	public void secResultMac() {
		WebElement seccart=driver.findElement(By.id("a-autoid-1-announce"));
		seccart.click();
	}
	@Then("user goto cart page")
	public void userCart() {
		WebElement p=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		p.click();
	}
	@And("user click checkout")
	public void checkout() {
		WebElement checkout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		checkout.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement add=driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']"));
		add.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement bank=driver.findElement(By.xpath("//span[contains(text(),'Choose an Option')]"));
		bank.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);

	        // Press down arrow key
	    actions.sendKeys(Keys.ARROW_DOWN).perform();
	    actions.sendKeys(Keys.ARROW_DOWN).perform();
	        // Click on the element
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    actions.click().perform();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement addbank=driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']"));
		addbank.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement buy=driver.findElement(By.xpath("//input[@aria-labelledby='submitOrderButtonId-announce']"));
		buy.click();
	}
	
	@Then("user click account")
	public void cAccount() {
		WebElement amazon=driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo clickable-heading']"));
		amazon.click();
		WebElement areturn=driver.findElement(By.xpath("//a[normalize-space()='Return to Cart']"));
		areturn.click();
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//span[normalize-space()='Sign Out']"));

		//To mouseover on sub menu
		actions.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}

}
