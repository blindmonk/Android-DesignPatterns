package com.design_patterns.strategy.quack;

import com.design_patterns.toast.ToastUtils;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        ToastUtils.showToasts("鸭子叫");
    }
}
