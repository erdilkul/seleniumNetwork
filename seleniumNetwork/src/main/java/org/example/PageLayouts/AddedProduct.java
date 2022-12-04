package org.example.PageLayouts;

import org.apache.log4j.Logger;
import org.example.Main.Mainİtems;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddedProduct extends Mainİtems {

    public AddedProduct(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void StickerPriceComparison(){
        String basketPrice=getText(By.cssSelector("span[class='cartItem__price -sale']"));
        Assert.assertEquals(basketPrice, ObjectPart.productPrice);
        logger.info("fiyat karsilastirilmasi yapildi");
    }
    public void competitionProduct(){
        WebElement element=findElements(By.cssSelector("span[class='cartItem__attrValue']")).get(0);
        String basketSize=element.getText();
        Assert.assertEquals(basketSize, ObjectPart.productSize);
        logger.info("beden karsilastirilmasi yapildi");
    }


    public Boolean competitionSale(){
        String discountPrice = getText(By.cssSelector("span[class='cartItem__price -sale']")).substring(0,4);
        double newPrice = Double.parseDouble(discountPrice);

        String nonDiscountPrice = getText(By.cssSelector("span[class='cartItem__price -old -labelPrice']")).substring(0,4);
        double oldPrice = Double.parseDouble(nonDiscountPrice);

        if (oldPrice > newPrice){
            return true;
        }
        else {
            return false;
        }

    }

    public void Progress(){
        ClickElement(By.cssSelector("button[class='continueButton n-button large block text-center -primary']"));
        logger.info("devam edilmesi saglandi");
    }
}
