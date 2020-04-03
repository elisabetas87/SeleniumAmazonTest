package com.selenium.tests;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.AmazonPage;
import com.selenium.pages.BasketPage;
import com.selenium.pages.ProductPage;

public class AmanzonTest extends BaseTest {

	@Test(groups = { "AMAZON" })
	public void TestAmazonSearch() throws IOException, URISyntaxException {

		AmazonPage amazon = new AmazonPage(driver);
		ProductPage product = new ProductPage(driver);
		BasketPage basket = new BasketPage(driver);

		// First page
		amazon.writeASearchOnInput();
		amazon.clickOnLens();
		amazon.clickOnImage();

		// product page
		product.clickOnDropdown();
		product.clickSecondValue();
		String titleFirst = product.getTitle1();
		String priceFirstPage = product.getPrice1();
		String sellerFirstPage = product.getSeller1();
		product.clickAddToBasket();
		product.clickCheckBasket();

		// basket page
		String priceBasketPage = basket.getPriceBasketPage();
		String sellerBasketPage = basket.getSellerBasketPage();
		System.out.println(sellerFirstPage + sellerBasketPage);
		Assert.assertTrue(product.isTheSameValue(priceFirstPage, priceBasketPage), "both prices are the same");
		Assert.assertTrue(product.isTheSameValue(sellerFirstPage, sellerBasketPage), "both sellers are the same");
		amazon.clickToInitialProduct();

		// return to product page
		String titleThen = product.getTitle1();
		Assert.assertTrue(product.isTheSameValue(titleFirst, titleThen), "both titles are the same");

	}

}
