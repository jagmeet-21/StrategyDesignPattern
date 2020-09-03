package com.jag.StrategyDesignPattern;

public class FlyNowhere implements FlyBehavior {
	 @Override
	  public void performFly() {
	    System.out.println("I don't fly anywhere");
	  }
}
