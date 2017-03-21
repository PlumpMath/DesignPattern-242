package com.dp.abstractfactory;

import com.dp.client.Product;

public abstract class AbstractFactory {

  public enum ProductType {
    A, B
  }

	abstract public Product CreateProductA();
	abstract public Product CreateProductB();

	static public AbstractFactory getFactory(ProductType type)
	{
		switch (type)
		{
			case A:
				return new ConcreteFactory1();
			case B:
				return new ConcreteFactory2();
			default:
				break;
		}
		return null;
	}
}
