package com.selenium.pages;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;

	// Constructor
	public ProductPage(WebDriver driver) {
		this.driver = driver;

		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='native_dropdown_selected_size_name']")
	private WebElement select_size_dropdown;

	@FindBy(xpath = "//option[@data-a-id='size_name_2']")
	private WebElement select_value2;

	@FindBy(xpath = "//span[@id='productTitle']")
	private WebElement product_title1;

	@FindBy(xpath = "//span[@id='priceblock_ourprice']")
	private WebElement price_firstpage;

	@FindBy(xpath = "//a[@id='sellerProfileTriggerId']")
	private WebElement seller_firstpage;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement basket_btn;

	@FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
	private WebElement basket_btn2;

	public void clickOnDropdown() throws IOException, URISyntaxException {
		select_size_dropdown.click();
	}

	public void clickSecondValue() throws IOException, URISyntaxException {
		select_value2.click();
	}

	public String getTitle1() throws IOException, URISyntaxException {
		return product_title1.getText();
	}

	public String getPrice1() throws IOException, URISyntaxException {
		return price_firstpage.getText();
	}

	public String getSeller1() throws IOException, URISyntaxException {
		return seller_firstpage.getText();
	}

	public void clickAddToBasket() throws IOException, URISyntaxException {
		basket_btn.click();
	}

	public void clickCheckBasket() throws IOException, URISyntaxException {
		basket_btn2.click();
	}

	public boolean isTheSameValue(String r1, String r2) {
		return r1.equals(r2);
	}

}
