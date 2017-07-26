package com.design_patterns.strategy.quack;

import com.design_patterns.toast.ToastUtils;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        ToastUtils.showToasts("吱吱叫");
    }
}
