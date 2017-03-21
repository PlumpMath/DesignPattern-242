package com.dp.proxy;

public class Proxy implements IProxy{
	IProxy worker = null;
	public Proxy(IProxy p)
	{
		worker = p;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("before work...");
		worker.operation();
		System.out.println("after work...");
	}

}
