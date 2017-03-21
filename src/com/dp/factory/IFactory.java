package com.dp.factory;

import com.dp.client.Product;

public interface IFactory {
	public Product CreateProduct(String product);
}
