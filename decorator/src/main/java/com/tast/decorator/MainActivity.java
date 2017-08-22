package com.tast.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.design_patterns.toast.ToastUtils;
import com.tast.decorator.coffee.DarkRoast;
import com.tast.decorator.coffee.Espresso;
import com.tast.decorator.coffee.HouseBlend;
import com.tast.decorator.seasoning.Mocha;
import com.tast.decorator.seasoning.Soy;
import com.tast.decorator.seasoning.Whip;

/**
 * 装饰者模式（最好要配合“工厂”和“生成器”
 * 设计模式时将有更好的方式建立装饰者对象）
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastUtils.init(this);

        Beverage beverage = new Espresso();
        ToastUtils.showToasts(beverage.getDescription() + " ¥" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);//用Mocha装饰它
        beverage2 = new Mocha(beverage2);//用第二个Mocha装饰它
        beverage2 = new Whip(beverage2);//用Whip装饰它
        ToastUtils.showToasts(beverage2.getDescription() + " ¥" + beverage2.cost());

        //最后再来一杯调料为豆浆、摩卡、奶泡的HouseBlend咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        ToastUtils.showToasts(beverage3.getDescription() + " ¥" + beverage3.cost());
    }
}
