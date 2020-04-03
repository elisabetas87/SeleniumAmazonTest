package com.selenium.pages;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

WebDriver driver;
	
	//Constructor
	public BasketPage(WebDriver driver){
	       this.driver=driver;

	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	   
		@FindBy(xpath = "//span[@class=\"a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold\"]")
		private WebElement price_basketpage;
		
		@FindBy(xpath = "//a[@target='AmazonHelp']")
		private WebElement seller_basketpage;
		
		public String getPriceBasketPage () throws IOException, URISyntaxException {
			return price_basketpage.getText();
		}
		
		public String getSellerBasketPage () throws IOException, URISyntaxException {
			return seller_basketpage.getText();
		}
		
}
