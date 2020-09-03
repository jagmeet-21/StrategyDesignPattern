package com.jag.StrategyDesignPattern;

public class RobotSecurity extends Robot {
	public RobotSecurity() {
		r=new RunwithSpeed();
		f=new FlyNowhere();
	}
	public void setRunBehavior(RunBehavior r) {
		this.r=r;
	}
	public void setFlyBehavior(FlyBehavior f) {
		this.f=f;
	}
}
