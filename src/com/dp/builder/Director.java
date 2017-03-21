package com.dp.builder;

import com.dp.client.Product;

public class Director {
	Builder m_Builder = null;
	public Director(Builder builder)
	{
		m_Builder = builder;
	}
	public Product getProduct()
	{
		return m_Builder.getProduct();
	}
	
	public void makeProduct()
	{
		m_Builder.createProduct();
		m_Builder.buildPartA();
		m_Builder.buildPartB();
	}
}
