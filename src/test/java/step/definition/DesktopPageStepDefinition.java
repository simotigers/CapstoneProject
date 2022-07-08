package step.definition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.object.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base{
	
	DesktopPageObject desktopPageObject = new DesktopPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObject.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
		Utils.takeScreenShot();
	    
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObject.clickOnShowAllDesktops();
		logger.info("user clicked on Show all desktops");
	    
	}
//  Scenario: User verify all items are present in Desktops tab

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktopPageObject.desktopsItems();
		for(WebElement element:desktopsElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title")+ " is present");
			Utils.takeScreenShot();
		}
		
	    
	}
//  Scenario: User add HP LP 3065 from Desktops tab to the cart

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPageObject.clickOnHPLP3065Item();
		logger.info("user clicked Add to Cart Option");
	    
	}

	@When("User select quantity {string}")
	public void user_select_quantity1(String string) {
		desktopPageObject.selectQuantity(string);
		logger.info("user selected quantity " +string);
	    
	}

	@When("User click add to Cart button11")
	public void user_click_add_to_cart_button11() {
		desktopPageObject.clickOnAddToCartButton();
		logger.info("user clicked add to cart button");
	    
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
		Assert.assertEquals(desktopPageObject.successMessage(),expectedSuccessMessage);
		Assert.assertTrue(desktopPageObject.isSuccessMessagePresent());
		logger.info(expectedSuccessMessage + " equals to " + desktopPageObject.successMessage() );
		Utils.takeScreenShot();
	    
	}
//  Scenario: User add Canon EOS 5D from Desktops tab to the cart

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPageObject.ClickOnCanonAddCart();
		logger.info("Canon EOS 5Ditem clicked");
		
	    
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPageObject.ClickOnSelectRed();
	    
	}

	@When("User Select quantity {string}")
	public void user_select_quantity(String string) {
			desktopPageObject.SlectCameraQuantity(string);
			logger.info("user selected camera quantity " +string);
	    
	}

	@When("User click add to Cart button2")
	public void user_click_add_to_cart_button2() {
		desktopPageObject.ClickOnAddCanonToCart();
		logger.info("camera added to cart");
	}

	@Then("User should see a message1 {string}")
	public void user_should_see_a_message1(String cameraexpectedSuccessMessage) {
		Assert.assertEquals(desktopPageObject.GetCanonScessMessage(),cameraexpectedSuccessMessage);
		logger.info(cameraexpectedSuccessMessage + " equals to "+desktopPageObject.GetCanonScessMessage() );
		Utils.takeScreenShot();
	    
	}
//  Scenario: User add a review to Canon EOS 5D item in Desktops tab

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObject.clickOnCanonEOS5DCamera();
		logger.info("camera Clicked Canon EOS 5D");
	    
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObject.clickOnReviewLink();
		logger.info("review link clicked");
	    
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> reviewInformation = dataTable.asMaps(String.class,String.class);
		desktopPageObject.enterYourName(reviewInformation.get(0).get("yourname"));
		desktopPageObject.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktopPageObject.selectRating(reviewInformation.get(0).get("Rating"));
		logger.info("user filled the review information");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		desktopPageObject.ClickOnReviewContinueButton();
		logger.info("user clicked on continue button");
	    
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String expectedReviewMessage) {
		Assert.assertEquals(desktopPageObject.reviewText(),expectedReviewMessage);
		Assert.assertTrue(desktopPageObject.isreviewScessMessageText());
		logger.info(expectedReviewMessage + " equals to "+desktopPageObject.reviewText() );
		Utils.takeScreenShot();
	    
	}
	
}