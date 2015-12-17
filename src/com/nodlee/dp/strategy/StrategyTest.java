package com.nodlee.dp.strategy;

/**
 * 策略模式
 * @since 2015年12月17日
 * @author huailiang
 */
public class StrategyTest {
	public static void main(String[] args) {
		Duck duck = new RubberDuck();
		duck.performFly();
		duck.performQuack();
	}
}
