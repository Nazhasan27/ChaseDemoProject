package chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimatedRatesLocators {

		@FindBy(xpath = "//*[@id='custom-pager__container-b']/div[3]/button")
		public WebElement rightArrow;
		
		@FindBy(xpath = "//*[@id='slick-slide05']/a/div[2]")
		public WebElement autoIcon;

		@FindBy(xpath = "//*[@id='year']")
		public WebElement year;

		@FindBy(xpath = "//*[@id='make']")
		public WebElement make;
		
		@FindBy(xpath = "//*[@id='state']")
		public WebElement state;
		
		@FindBy(xpath = "//*[@id='credit-rating']")
		public WebElement creditRating;
		
		@FindBy(xpath = "//*[@id='amount']")
		public WebElement amount;
		
		@FindBy(xpath = "//*[@id='rpt-get-rate-button']/span")
		public WebElement getInfo;
		
}
