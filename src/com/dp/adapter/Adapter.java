package com.dp.adapter;

public class Adapter extends Target {
	protected Adaptee m_Adaptee = null;
	public Adapter(Adaptee ada)
	{
		m_Adaptee = ada;
	}
	public void request()
	{
		m_Adaptee.specialRequest();
	}

}
