package com.jag.StrategyDesignPattern;

public class RobotSimulator {
	public static void main(String args[])
	{
		RobotCCTV cctv=new RobotCCTV();
		cctv.setFlyBehavior(new FlyFlight());
		cctv.toFly();
		
		cctv.setRunBehavior(new RunwithSpeed());
		cctv.toRun();
		
		System.out.println("---------------------------");
		
		RobotSecurity sec=new RobotSecurity();
		sec.toFly();
		System.out.println("--dynamically set--");
		sec.setFlyBehavior(new FlyFlight());
		sec.toFly();
		sec.toRun();
		System.out.println("--dynamically set--");
		sec.setRunBehavior(new RunwithSpeed());
		sec.toRun();
	}
}
