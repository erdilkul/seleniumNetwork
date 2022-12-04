package org.example.Tests;

import org.apache.log4j.Logger;
import org.example.ToTest.ImportantItem;
import org.example.PageLayouts.AddedProduct;
import org.example.PageLayouts.MainEntrance;
import org.example.PageLayouts.FirstAppearance;
import org.example.PageLayouts.ObjectPart;
import org.junit.Test;

import java.io.FileNotFoundException;

public class MainTest extends ImportantItem {
    final static Logger logger = Logger.getLogger(MainTest.class.getName());

    @Test
    public void networkSeleniumTest() throws InterruptedException, FileNotFoundException {
        MainEntrance homePage = new MainEntrance(driver, logger);
        ObjectPart productPage = new ObjectPart(driver, logger);
        AddedProduct basketPage = new AddedProduct(driver, logger);
        FirstAppearance loginPage=new FirstAppearance(driver,logger);

        homePage.GoİnDirection();
        homePage.CloseTab();
        homePage.ControlUrl();
        homePage.Contact();
        productPage.IntroductionToOptions();
        productPage.checkSecondPageUrl();
        productPage.hoverOnProduct();
        productPage.selectRandomProduct();
        productPage.getPrice();
        productPage.getSize();
        productPage.goToBasket();
        basketPage.StickerPriceComparison();
        basketPage.Progress();
        basketPage.competitionProduct();
        basketPage.competitionSale();
        basketPage.Progress();
        loginPage.LoginContactİnformation();
        loginPage.CheckLogin();
        loginPage.SelectEmblem();
        homePage.EmblemClick();
        homePage.DeleteCartProduct();
        homePage.CheckToDeleteProduct();
        homePage.EmblemClick();
        homePage.ControlOfProducts();

    }
}
