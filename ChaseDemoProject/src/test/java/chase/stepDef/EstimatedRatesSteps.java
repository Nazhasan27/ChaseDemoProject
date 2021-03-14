package chase.stepDef;

import cucumber.api.java.en.*;
import chase.pageAction.EstimatedRatesAction;

public class EstimatedRatesSteps {

	EstimatedRatesAction EstimatedRatesActionObj = new EstimatedRatesAction();

	@When("^clicks on right arrow in carousel$")
	public void clicks_on_right_arrow_in_carousel() throws Throwable {
		System.out.println("clicks on right arrow in carousel");
		EstimatedRatesActionObj.rightArrow();
	}

	@When("^clicks on auto$")
	public void clicks_on_auto() throws Throwable {
		System.out.println("clicks on auto");
		EstimatedRatesActionObj.autoIcon();

	}

	@When("^selects Year$")
	public void selects_Year() throws Throwable {
		System.out.println("selects Year");
		EstimatedRatesActionObj.year();

	}

	@When("^selects Make$")
	public void selects_Make() throws Throwable {
		System.out.println("selects Make");
		EstimatedRatesActionObj.make();
	}

	@When("^selects State$")
	public void selects_State() throws Throwable {
		System.out.println("selects State");
		EstimatedRatesActionObj.state();
	}

	@When("^Selects Estimated credit rating$")
	public void selects_Estimated_credit_rating() throws Throwable {
		System.out.println("Selects Estimated credit rating");
		EstimatedRatesActionObj.creditRating();
	}

	@When("^Selects Amount$")
	public void selects_Amount() throws Throwable {
		System.out.println("Selects Amount");
		EstimatedRatesActionObj.amount();
	}

	@Then("^user can Get info$")
	public void user_can_Get_info() throws Throwable {
		System.out.println("user can Get info");
		EstimatedRatesActionObj.getInfo();
	}
}
