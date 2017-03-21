package com.dp.abstractfactory;

import com.dp.client.Product;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public Product CreateProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public Product CreateProductB() {
		return new ConcreteProductB1();
	}

}
