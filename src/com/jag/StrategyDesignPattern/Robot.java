package com.jag.StrategyDesignPattern;

public abstract class Robot {
	
	public RunBehavior r;
	public FlyBehavior f;
	
	public void toFly() {
		f.performFly();
	}
	public void toRun() {
		r.performRun();
	}
	
}
