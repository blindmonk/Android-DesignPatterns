package com.design_patterns.strategy.quack;

import com.design_patterns.toast.ToastUtils;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        ToastUtils.showToasts("我不会叫");
    }
}
