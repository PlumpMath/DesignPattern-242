package com.dp.bridge;

public class AbstractionRefine extends Abstraction {
	AbstractionImp imp = null;
	public AbstractionRefine(AbstractionImp imp)
	{
		this.imp = imp;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		imp.operation();
	}

}
