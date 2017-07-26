package com.design_patterns.strategy.fly;

import com.design_patterns.toast.ToastUtils;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        ToastUtils.showToasts("我不会飞");
    }
}
