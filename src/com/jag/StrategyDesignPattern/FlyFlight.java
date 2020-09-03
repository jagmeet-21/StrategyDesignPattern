package com.jag.StrategyDesignPattern;

public class FlyFlight implements FlyBehavior{
	  @Override
	  public void performFly() {
	    System.out.println("I'm in flight mode");    
	  }
}
