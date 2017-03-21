package com.dp.prototype;

public class ConcretePrototype extends Prototype {
	private String m_strName = ""; 
	public ConcretePrototype(String name)
	{
		this.m_strName = name;
	}
	public ConcretePrototype(ConcretePrototype copy)
	{
		this.m_strName = copy.m_strName;
	}
	@Override
	public Prototype Clone() {
		// TODO Auto-generated method stub
		return new ConcretePrototype(this);
	}
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println(m_strName);
	}
}
