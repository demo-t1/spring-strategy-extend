package io.github.shengchaojie.springstrategy.test.demo.calculateprice;

import io.github.shengchaojie.springstrategy.StrategyIdentifier;

/**
 * @author shengchaojie
 * @date 2019-07-30
 **/
@StrategyIdentifier(identifyCode = "VEGETABLE")
public class VegetableCaculatePriceStrategy implements CalculatePriceStrategy{

    public Integer calculate(String sku, Integer unitPrice, Integer num) {
        System.out.println("没有优惠");
        return unitPrice*num;
    }
}
