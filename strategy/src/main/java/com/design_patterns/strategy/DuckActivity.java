package com.design_patterns.strategy;

import com.design_patterns.strategy.fly.FlyBehavior;
import com.design_patterns.strategy.fly.FlyNoWay;
import com.design_patterns.strategy.quack.MuteQuack;
import com.design_patterns.strategy.quack.QuackBehavior;

public class DuckActivity {

    private FlyBehavior mFlyBehavior;
    private QuackBehavior mQuackBehavior;

    DuckActivity() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new MuteQuack();
    }

    void performFly() {
        mFlyBehavior.fly();
    }

    void performQuack() {
        mQuackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.mQuackBehavior = quackBehavior;
    }
}
