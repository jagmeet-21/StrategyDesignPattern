package com.jag.StrategyDesignPattern;

public class RunNowhere implements RunBehavior{
	 @Override
	  public void performRun() {
	    System.out.println("I don't run");
	  }
}
