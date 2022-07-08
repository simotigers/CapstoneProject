package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.object.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopNoteBooksPageObject = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksPageObject.ClickOnLaptopAndNotes();
		logger.info("user clicked on Laptop & NoteBook tab");
	 
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksPageObject.ClickOnShowWllLapTops();
		logger.info("user clicked on  show Laptop & NoteBook tab");
		Utils.takeScreenShot();
		
	    
	}
	//Scenario: Add and Remove a Mac book from Cart 

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNoteBooksPageObject.ClickOnMacBook();
		logger.info("user clicked on macBook item");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		laptopNoteBooksPageObject.ClickOnAddMacBook();
		logger.info("user clicked on Add macBook item");

	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String expectedMacSuccessMsg) {
		Assert.assertEquals(laptopNoteBooksPageObject.GetMacSuccessMsg(),expectedMacSuccessMsg);
		logger.info(expectedMacSuccessMsg + " equals to " + laptopNoteBooksPageObject.GetMacSuccessMsg() );
	    
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
		laptopNoteBooksPageObject.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");
		Thread.sleep(2000);
	}
		
	    
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBooksPageObject.ClickOnCartOption();
		logger.info("user clicked on the cart option");

	    
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObject.ClickOnRemoveMac();
		logger.info("user clicked on the  X  to remove the item fromcart");

	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
		laptopNoteBooksPageObject.noItemsAddtothecart();
		logger.info("user see their is no items add to the cart");
		Thread.sleep(2000);
		Utils.takeScreenShot();
	}

// Scenario: Product Comparison  

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on1() {
		laptopNoteBooksPageObject.ClickOnMacComparison();
		logger.info("user clicked on product on macbook");
	Utils.hardWait(6000);

	    
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on() {
		laptopNoteBooksPageObject.ClickOnMacAirComparison();
		logger.info("user clicked on product on macbook air");
		Utils.hardWait(6000);

	}

	@Then("User Should see a message4 {string}")
	public void user_should_see_a_message4(String string) throws InterruptedException {
		laptopNoteBooksPageObject.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Thread.sleep(2000);
	    
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBooksPageObject.ClickOnComparisonLink();
		logger.info("user clicked on comparison link on macbook air");

	    
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNoteBooksPageObject.CmparisonChartDisplayed();
		logger.info("the comparison chart is displayed");
		Utils.takeScreenShot();
	
	}
	// Scenario: Adding an item to Wish list   

	@When("User click on heart icon to add 'Sony VaIO'laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list()  throws InterruptedException {
		laptopNoteBooksPageObject.clickOnwishbutton();
		logger.info("user add Sony VaIO to wish list");
		Thread.sleep(5000);
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list()
			throws InterruptedException {
		laptopNoteBooksPageObject.youMustLogin();
		logger.info("user need to login to his account");
		Thread.sleep(5000);
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) throws InterruptedException {
		laptopNoteBooksPageObject.clickOnwishbutton();
		Thread.sleep(5000);
		Utils.takeScreenShot();
	}
// Scenario: Validate the price of MacBook Pro is 2000    

	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopNoteBooksPageObject.ClickOnMacBookPro();
		logger.info("Macbook pro clicked");

	    
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		laptopNoteBooksPageObject.ShowMacProPrice();
		logger.info("Macbook pro price is displayed");
		Utils.takeScreenShot();

	    
	}

}