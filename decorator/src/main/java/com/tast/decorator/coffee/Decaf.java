package com.tast.decorator.coffee;

import com.tast.decorator.Beverage;

/**
 * 描述：一种咖啡类型
 *
 * @author wmm
 * @time 2017/8/22 10:49
 */

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.39;
    }
}
