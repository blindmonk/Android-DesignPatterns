package com.tast.decorator.seasoning;

import com.tast.decorator.Beverage;
import com.tast.decorator.CondimentDecorator;

/**
 * 描述：一种咖啡调料
 *
 * @author wmm
 * @time 2017/8/22 11:00
 */

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 不只是描述饮料（例如“DarkRoast”）,
     * 而是能完整的连调料都描述出来（例如"“DarkRoast，Mocha”）
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 计算带Mocha饮料的价钱
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
