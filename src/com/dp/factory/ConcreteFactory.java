package com.dp.factory;

import com.dp.client.Product;

public class ConcreteFactory implements IFactory {

	@Override
	public Product CreateProduct(String product) {
		// TODO Auto-generated method stub
		try {
			try {
				return (Product)(Class.forName(product).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
