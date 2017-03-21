package com.dp.strategy;

public abstract class TemplateStrategy2 implements IStrategy {
	public void slove()
	{
		begin();
		end();
	}
	abstract public void begin();
	abstract public void end();
}
