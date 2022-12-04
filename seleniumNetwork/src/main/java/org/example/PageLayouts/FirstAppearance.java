package org.example.PageLayouts;

import org.apache.log4j.Logger;
import org.example.Main.Mainİtems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstAppearance extends Mainİtems {

    public FirstAppearance(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void LoginContactİnformation() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/test/resources/kullanici.csv"));
        sc.useDelimiter(",");
        String[] array=new String[2];
        array[0]=sc.nextLine();
        String mail = array[0];

        array[1]=sc.nextLine();
        String password=array[1];

        sendKeys(By.cssSelector("input[name='Email']"),mail);
        sendKeys(By.cssSelector("input[name='Password']"),password);
        logger.info("İsim bilgileri alindi");
    }

    public void CheckLogin(){
        isDisplayed(By.cssSelector("button[class='n-button large block text-center -primary ']"));
        logger.info("giriş sekmesi kontrol edilir.");
    }

    public  void SelectEmblem(){

        ClickElement(By.cssSelector("a0"));
        logger.info("network amblemine tiklandi");
    }
}
