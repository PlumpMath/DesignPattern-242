package com.dp.facade;

public class Facade {
	Subsystem1 m_s1;
	Subsystem2 m_s2;
	public Facade(Subsystem1 s1, Subsystem2 s2)
	{
		m_s1 = s1;
		m_s2 = s2;
		
	}
	public void OperationWrapper()
	{
		m_s1.operation();
		m_s2.operation();
		
	}
}
