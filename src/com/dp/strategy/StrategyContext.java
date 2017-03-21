package com.dp.strategy;

public class StrategyContext {
	IStrategy m_IStrategy = null;
	public StrategyContext(IStrategy s)
	{
		m_IStrategy = s;
	}
	public void  doAction()
	{
		m_IStrategy.slove();
	}
}
