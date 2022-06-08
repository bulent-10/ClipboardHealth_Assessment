package com.clipboardhealth.step_definitions;

import com.clipboardhealth.pages.Televisions;
import com.clipboardhealth.utilities.BrowserUtils;
import com.clipboardhealth.utilities.ConfigurationReader;
import com.clipboardhealth.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

import static com.clipboardhealth.utilities.BrowserUtils.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Television_StepDefinition {

    Televisions televisions = new Televisions();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user click on hamburger menu")
    public void user_click_on_hamburger_menu() {
        televisions.hamburgerMenuButton.click();
//        String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//        String actualTitle = Driver.getDriver().getTitle();
//        assertEquals(actualTitle,expectedTitle,"Title did not match!");
    }

//    @Then("user should see list of department under menu")
//    public void user_should_see_list_of_department_under_menu() {
//        verifyElementDisplayed(televisions.avatarIcon);
//    }

    @Then("user Click on the TV, Appliances and Electronics link")
    public void user_click_on_the_tv_appliances_and_electronics_link() {
        televisions.tvAppliancesElectronicsButton.click();
        assertTrue("TV,Appliances & Electronics section was not displayed!",televisions.tvAppliancesElectronicsButton.isDisplayed());
    }

    @Then("click on Televisions under Tv, Audio & Cameras sub section")
    public void click_on_televisions_under_tv_audio_cameras_sub_section() {
        televisions.televisionsButton.click();
        BrowserUtils.wait(1);
        titleVerification("Buy the latest LED TVs, 4K TVs and Android TVs online at Best Prices in India-Amazon.in | Shop by size, price, features and more");

    }

    @Then("Scroll down and filter the results by brand Samsung")
    public void scroll_down_and_filter_the_results_by_brand_samsung() {
        clickWithJS(televisions.samsungCheckbox);
        BrowserUtils.wait(1);
        titleVerification("Amazon.in");

    }

    @Then("user click on sort by:featured dropbox button")
    public void user_click_on_sort_by_featured_dropbox_button() {televisions.sortByFeaturedButton.click();}

    @Then("user click on High to Low prices from the dropbox menu")
    public void user_click_on_high_to_low_prices_from_the_dropbox_menu() {televisions.priceHighToLowButton.click();}

    @Then("user should see all Samsung televisions price descending order")
    public void user_should_see_all_samsung_televisions_price_descending_order() {
        verifyElementDisplayed(televisions.results);
    }

    @Then("user click on the second highest price TV")
    public void user_click_on_the_second_highest_price_tv() {
        televisions.secondHighestPriceElement.click();

        String mainHandle = Driver.getDriver().getWindowHandle();
        System.out.println("main window: "+ mainHandle);
        switchToWindow("401E7ECB96F1DD194FD2CD74A4CFF71D");


//
//        Set<String> windHandles = Driver.getDriver().getWindowHandles();
//        // Switch to new Window.
//        for (String eachTab : windHandles) {
//            Driver.getDriver().switchTo().window(eachTab);
//            String title=Driver.getDriver().getTitle();
//            System.out.println(eachTab);
//            if (title.equals("401E7ECB96F1DD194FD2CD74A4CFF71D")){
//                break;
//            }
//        }

    }

    @Then("user should be the second highest price TV's window")
    public void user_should_be_the_second_highest_price_tv_s_window() {
        verifyElementDisplayed(televisions.productTitle);
        String expectedTitle = televisions.secondHighestPriceElement.getText();
        String actualTitle = televisions.productTitle.getText();
        assertEquals(actualTitle,expectedTitle,"Titles did not match!!!");
    }



}
