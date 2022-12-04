package org.example.PageLayouts;

import org.apache.log4j.Logger;
import org.example.Main.Mainİtems;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectPart extends Mainİtems {

    private String secondPageUrl="https://www.network.com.tr/search?searchKey=ceket&page=2";
    public static String productPrice;
    public static String productSize;
    public ObjectPart(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void IntroductionToOptions() throws InterruptedException {
        scrollPage(By.cssSelector("div[class='productList__moreContent -prev']"));
        Thread.sleep(2000);
        ClickElement(By.cssSelector("button[class='button -secondary -sm relative']"));
        Thread.sleep(10000);
        logger.info("Daha fazla secenek gor");
    }

    public void checkSecondPageUrl(){
        Assert.assertEquals(secondPageUrl, getUrl());
        logger.info("url kontrol edildi");
    }

    public void hoverOnProduct(){
        hoverElementByIndex(By.cssSelector("div[class='products__item col-6 col-md-4']"), 0);
        logger.info("indirimli urunlere gelinir");
    }

    public void selectRandomProduct(){
        randomClick(By.xpath("//*[@class='products__item col-6 col-md-4'][1]//label[@class='radio-box__label -disabled'][4]"));
        logger.info("rastgele beden secimi yapilir");
    }

    public void getPrice(){
        productPrice = getText(By.cssSelector("span[class='a-product__price -salePrice']"));
        logger.info("urun fiyatina ulasilir");
    }

    public void getSize(){
        WebElement element=findElements(By.cssSelector("div[class='header__basketProductVariation--val']")).get(1);
        productSize = element.getText();
        logger.info("urun bedenine ualasılır");
    }

    public void goToBasket(){
        ClickElement(By.cssSelector("a[class='button -primary header__basket--checkout header__basketModal -checkout']"));

        logger.info("sepete gidilme saglanir");
    }
}
