package com.dp.client;
import com.dp.abstractfactory.AbstractFactory;
import com.dp.adapter.Adaptee;
import com.dp.adapter.Adapter;
import com.dp.adapter.Target;
import com.dp.bridge.Abstraction;
import com.dp.bridge.AbstractionImp;
import com.dp.bridge.AbstractionRefine;
import com.dp.bridge.ConcreteAbstractionImpB;
import com.dp.builder.ConcreteBuilder;
import com.dp.builder.Director;
import com.dp.command.Commander;
import com.dp.command.Receiver;
import com.dp.composite.Composite;
import com.dp.composite.Leaf;
import com.dp.facade.Facade;
import com.dp.facade.Subsystem1;
import com.dp.facade.Subsystem2;
import com.dp.factory.ConcreteFactory;
import com.dp.factory.IFactory;
import com.dp.prototype.ConcretePrototype;
import com.dp.prototype.Prototype;
import com.dp.proxy.Proxy;
import com.dp.proxy.Stub;
import com.dp.state.ConcreteStateA;
import com.dp.state.StateContext;
import com.dp.strategy.StrategyContext;
import com.dp.strategy.StrategyImp2;
import com.dp.strategy.StrategyImpl1;
import com.dp.template.ConcreteMethod1;
import com.dp.template.ConcreteMethod2;
import com.dp.template.Template;

public class Client {

	public static void main(String[] args) {
		testAbstractFactory();
		testBuilder();
		testPrototype();
		testAdapter();
		testBridge();
		testComposite();
		testFacade();
		testProxy();
		testTemplate();
		testStrategy();
		testCommand();
		testState();
	}
	
	public static void testFactory()
	{
		IFactory factory = new ConcreteFactory();
		factory.CreateProduct("com.dp.factory.ConcreteProduct2").display();
	}
	
	public static void testAbstractFactory()
	{
		AbstractFactory af1 = AbstractFactory.getFactory(AbstractFactory.ProductType.A);
		af1.CreateProductA();
		AbstractFactory af2 = AbstractFactory.getFactory(AbstractFactory.ProductType.B);
		af2.CreateProductB();
	}
	
	public static void testBuilder()
	{
		Director d = new Director(new ConcreteBuilder());
		d.makeProduct();
		Product p = d.getProduct();
		p.display();
	}
	public static void testPrototype()
	{
		Prototype cp = new ConcretePrototype("hello").Clone();
		cp.Show();
	}
	
	public static void testAdapter()
	{
		Target t = new Adapter(new Adaptee());
		t.request();
	}
	
	public static void testBridge()
	{
		AbstractionImp imp = new ConcreteAbstractionImpB();
		Abstraction a = new AbstractionRefine(imp);
		a.operation();
	}
	public static void testComposite()
	{
		Leaf l1 = new Leaf("child1");
		Composite p1 = new Composite("parent1");
		p1.AddChild(l1);
		Leaf l2 = new Leaf("child2");
		Leaf l3 = new Leaf("child3");
		Composite p2 = new Composite("parent2");
		p2.AddChild(p1);
		p2.AddChild(l2);
		p2.AddChild(l3);
		p2.operation();
		p1.RemoveChild(l1);
		p2.operation();
	}
	
	public static void testFacade()
	{
		Facade f = new Facade(new Subsystem1(), new Subsystem2());
		f.OperationWrapper();
	}
	
	public static void testProxy()
	{
		Proxy p = new Proxy(new Stub());
		p.operation();
	}
	
	public static void testTemplate()
	{
		Template t = new ConcreteMethod1();
		t.templateMethod();
		t = new ConcreteMethod2();
		t.templateMethod();
	}
	public static void testStrategy()
	{
		StrategyContext sc = new StrategyContext(new StrategyImp2());
		sc.doAction();
		sc = new StrategyContext(new StrategyImpl1());
		sc.doAction();
	}
	public static void testCommand()
	{
		Commander c = new Commander(new Receiver(), "display", new Object[]{new String("My number is"), new Integer(5)});
		c.execution();
	}
	
	public static void testState()
	{
		StateContext sc = new StateContext(new ConcreteStateA());
		sc.operateChangeState();
		sc.operateChangeState();
	}
}
