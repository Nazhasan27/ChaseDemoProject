package chase.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import chase.pageElements.EstimatedRatesLocators;
import chase.utilities.SetupDrivers;

public class EstimatedRatesAction {

	EstimatedRatesLocators EstimatedRatesLocatorsObj;

	public EstimatedRatesAction() {

		this.EstimatedRatesLocatorsObj = new EstimatedRatesLocators();
		PageFactory.initElements(SetupDrivers.driver, EstimatedRatesLocatorsObj);
		SetupDrivers.driver.get("https://www.chase.com/");
	}

	public void ChaseHomepage() {
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();
	}

	public void rightArrow() throws Throwable {
		EstimatedRatesLocatorsObj.rightArrow.click();
		Thread.sleep(2000);
	}

	public void autoIcon() throws Throwable {
		EstimatedRatesLocatorsObj.autoIcon.click();
		Thread.sleep(2000);

	}

	public void year() throws Throwable {
		Select ddYear = new Select(EstimatedRatesLocatorsObj.year);
		ddYear.selectByVisibleText("2021");
		
		
	}

	public void make() throws Throwable {
		Select ddMake = new Select(EstimatedRatesLocatorsObj.make);
		ddMake.selectByVisibleText("AUDI");
		
	}

	public void state() throws Throwable {
		Select ddState = new Select(EstimatedRatesLocatorsObj.state);
		ddState.selectByVisibleText("New York");
		

	}

	public void creditRating() throws Throwable {
		Select ddCreditRating = new Select(EstimatedRatesLocatorsObj.creditRating);
		ddCreditRating.selectByVisibleText("Very Good");
		

	}

	public void amount() throws Throwable {
		EstimatedRatesLocatorsObj.amount.sendKeys("7000");
		
	}

	public void getInfo() throws Throwable {
		EstimatedRatesLocatorsObj.getInfo.click();


	}
}
