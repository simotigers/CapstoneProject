package page.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base{
	public DesktopPageObject(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement DisckTopTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName ="img")
	private List <WebElement> items; 
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id ="input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id ="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="(//a[text()='HP LP3065'])[3]")              
	private WebElement HPLPsuccessmessage;	
	
	@FindBy(xpath="(//a[text()='Canon EOS 5D Camera'])")
	private WebElement CanonCamera;
	
	@FindBy(css="#input-option226 > option:nth-child(2)")
	private WebElement SelectRed;
	
	@FindBy(id="input-quantity")
	private WebElement CameraQuantity;
	
	@FindBy(id="button-cart")
	private WebElement AddCanonToCart;
	
	@FindBy(xpath="(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement CanonScessMessage;
	
	@FindBy(xpath ="//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath ="//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id ="input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath ="//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id ="button-review")
	private WebElement ReviewContinueButton;
	
	@FindBy(css ="#form-review > div.alert.alert-success.alert-dismissible")
	private WebElement reviewSubmissionMessage;
	
	//methods==>
	// this method to click on Desktop tab
	public void clickonDesktopsTab() {
		Utils.hoveMouseOverElement(DisckTopTab);
	}
	//this method to click on Show all desktop
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	//this method  to see all items are present in Desktop page
	public List<WebElement> desktopsItems(){
		List<WebElement> itemsDesktop = items;
		return itemsDesktop;
	}
	//this method  to see all items are present in Desktop page

	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	// this method to  click  ADD TO CART option on HP LP3065item
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
	}
	// this method to select quantity '1'
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	// this method to click add to Cart button
	public String successMessage() {
		String actualResult = "Success: You have added "+HPLPsuccessmessage.getText()+" to your shopping cart!";
		return actualResult;
	}
	//this method to see a message 'Success: You have added HP LP3065 to your shopping cart!'
	public boolean isSuccessMessagePresent() {
		if(HPLPsuccessmessage.isDisplayed())
			return true;
		else 
			return false;
		}
	// this method to click  ADD TO CART option on Canon EOS 5Ditem
	
	public void ClickOnCanonAddCart() {
		CanonCamera.click();
	}
	// this method to select red color
	public void ClickOnSelectRed() {
		SelectRed.click();
	}
	// this method to select camera quantity
	public void SlectCameraQuantity(String CameraQuantityvalue ) {
		CameraQuantity.clear();
		CameraQuantity.sendKeys(CameraQuantityvalue);
	}
	// this method to add the camera to the cart
	public void ClickOnAddCanonToCart() {
		AddCanonToCart.click();
	}
	// this methos to see the success message for adding the camera to the cart
	public String GetCanonScessMessage() {
		String CanonScessMessageText = "Success: You have added "+CanonScessMessage.getText()+" to your shopping cart!";
		return CanonScessMessageText;
	}
	// this method to click on the camera
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	// this method to click on the write review link
	public void clickOnReviewLink() {
		writeReviewLink.click();
	}
	
	// enter the name
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}
	// enter the last name
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}
	// click on continue button
	public void ClickOnReviewContinueButton() {
		ReviewContinueButton.click();
	}
	//this method to select the rating
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}
	}
	
	public void clickOnContinueButton() {
		ReviewContinueButton.click();
	}
	
	
	// this method to see the success message for adding a review
	public String reviewText() {
		String reviewScessMessageText = reviewSubmissionMessage.getText().replaceFirst("", " ");
		return reviewScessMessageText;
	}
	// review text displayed
	public boolean isreviewScessMessageText() {
		if(reviewSubmissionMessage.isDisplayed())
			return true;
		else 
			return false;}
	
	}
	
	
	


