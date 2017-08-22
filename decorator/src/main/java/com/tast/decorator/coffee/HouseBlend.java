package com.tast.decorator.coffee;

import com.tast.decorator.Beverage;

/**
 * 描述：一种咖啡类型
 *
 * @author wmm
 * @time 2017/8/22 10:49
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
