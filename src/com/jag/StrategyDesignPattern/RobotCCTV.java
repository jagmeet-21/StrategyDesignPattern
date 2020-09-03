package com.jag.StrategyDesignPattern;

public class RobotCCTV extends Robot{
	
	public void setRunBehavior(RunBehavior r) {
		this.r=r;
	}
	public void setFlyBehavior(FlyBehavior f) {
		this.f=f;
	}
}
