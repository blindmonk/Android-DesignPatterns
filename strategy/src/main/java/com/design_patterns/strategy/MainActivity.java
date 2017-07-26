package com.design_patterns.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.design_patterns.strategy.fly.FlyWithWings;
import com.design_patterns.strategy.quack.Squeak;
import com.design_patterns.toast.ToastUtils;

/**
 * 设计模式- 策略模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.init(this);
        DuckActivity mDuckActivity = new DuckActivity();
        mDuckActivity.performFly();
        //在运行时来改变鸭子的状态--使鸭子会飞
        mDuckActivity.setFlyBehavior(new FlyWithWings());
        mDuckActivity.performFly();
        //在运行时来改变鸭子的状态--使鸭子吱吱叫
        mDuckActivity.setQuackBehavior(new Squeak());
        mDuckActivity.performFly();
    }
}
