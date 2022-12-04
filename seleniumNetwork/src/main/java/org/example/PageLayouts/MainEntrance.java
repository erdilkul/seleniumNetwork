package org.example.PageLayouts;

import org.apache.log4j.Logger;
import org.example.Main.Mainİtems;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainEntrance extends Mainİtems {

    private String url="https://www.network.com.tr/";

    public MainEntrance(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void GoİnDirection() {
        goToUrl(url);
        logger.info(url + "adrese git");
    }

    public void ControlUrl() {
        Assert.assertEquals(url, getUrl());
        logger.info("url kontrolünü saglandi");
    }

    public void Contact(){
        sendKeys(By.cssSelector("input[name='searchKey']"),"ceket" + Keys.ENTER);
        logger.info("ceket arandi");
    }

    public void EmblemClick(){
        ClickElement(By.cssSelector("button[class='header__basketTrigger js-basket-trigger -desktop']"));
        logger.info("sepet amblemine tiklandi");
    }

    public void DeleteCartProduct(){
        ClickElement(By.cssSelector("div[class='header__basketProductBtn header__basketModal -remove']"));
        logger.info("sepetteki kiyafetler  siliniyor");
    }
    public void ControlOfProducts(){
        String emptyBasket=getText(By.cssSelector("span[class='header__emptyBasketText']"));
        Assert.assertEquals(emptyBasket, "Sepetiniz Henüz Boş");
        logger.info("sepetin bos olup olmadigi kontrol ediliyor.");
    }

    public void CheckToDeleteProduct(){
        ClickElement(By.cssSelector("button[class='btn -black o-removeCartModal__button']"));
        logger.info("urunun silindigi dogrulandi");
    }



    public void CloseTab(){
        ClickElement(By.id("onetrust-accept-btn-handler"));
    }
}
