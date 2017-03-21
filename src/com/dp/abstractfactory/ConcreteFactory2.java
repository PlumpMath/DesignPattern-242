package com.dp.abstractfactory;

import com.dp.client.Product;


public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public Product CreateProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public Product CreateProductB() {
		return new ConcreteProductB2();
	}

}
