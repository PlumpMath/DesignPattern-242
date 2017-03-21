package com.dp.builder;

import com.dp.client.Product;

public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	protected Product m_Product = null;
	public void createProduct()
	{
		m_Product = new Product();
	}
	public Product getProduct()
	{
		return m_Product;
	}
}
