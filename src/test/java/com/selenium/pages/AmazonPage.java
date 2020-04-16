package com.selenium.pages;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

	WebDriver driver;

	// Constructor
	public AmazonPage(WebDriver driver) {
		this.driver = driver;

		// Initialise Elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement input_search;

	@FindBy(xpath = "//input[@value='Ir']")
	private WebElement submit_search;

	@FindBy(xpath = "//span[@data-component-id='14']/a/div/img")
	private WebElement img_item;

	@FindBy(xpath = "//span[@class='a-size-medium sc-product-title']")
	private WebElement link_initial_product;

	public void writeASearchOnInput() throws IOException, URISyntaxException {
		input_search.sendKeys("adidas");
	}

	public void clickOnLens() throws IOException, URISyntaxException {
		submit_search.click();
	}

	public boolean isLensDisplayed() {
		return submit_search.isDisplayed();
	}

	public void clickOnImage() throws IOException, URISyntaxException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		img_item.click();
	}

	public void clickToInitialProduct() throws IOException, URISyntaxException {
		link_initial_product.click();
	}

}
