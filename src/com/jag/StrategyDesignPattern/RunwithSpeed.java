package com.jag.StrategyDesignPattern;

public class RunwithSpeed implements RunBehavior{
	@Override
	  public void performRun() {
	    System.out.println("I'm going to run in normal speed");
	  }
}
