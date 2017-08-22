package com.tast.decorator.coffee;

import com.tast.decorator.Beverage;

/**
 * 描述：一种咖啡类型
 *
 * @author wmm
 * @time 2017/8/22 10:49
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.89;
    }
}
