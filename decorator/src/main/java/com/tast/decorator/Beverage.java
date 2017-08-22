package com.tast.decorator;

/**
 * 描述：抽象类
 *
 * @author wmm
 * @time 2017/8/22 10:39
 */

public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
