package com.nttdataqa.serenity.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface {

    public static final Target BNT_1 = Target.the("Button Add Product1").located(By.id("//*[@id='button-guest']"));
    public static final Target BNT_2 = Target.the("Button Add Product2").located(By.id("//*[@id='button-shipping-method']"));
    public static final Target BNT_3 = Target.the("Button Continue3").located(By.id("//*[@id='collapse-payment-method']/div/div/[3]/div/input[1]"));
    public static final Target BNT_4 = Target.the("Button Continue4").located(By.id("//*[@id='button-payment-method']"));
    public static final Target BNT_5 = Target.the("Button Continue4").located(By.id("//*[@id='button-confirm']"));

}
