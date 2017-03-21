package com.dp.strategy;

public abstract class TemplateStrategy implements IStrategy {
	public void slove()
	{
		start();
		stop();
	}
	abstract public void start();
	abstract public void stop();
}
