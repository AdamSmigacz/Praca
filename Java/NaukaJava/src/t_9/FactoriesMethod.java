package t_9;


interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{

	 Implementation1() {
		
	}
	@Override
	public void method1() {
		System.out.println("Implementation1.method1");
		
	}

	@Override
	public void method2() {
		System.out.println("Implementation1.method2");
		
	}
	
}

class Impelentation1Factory implements ServiceFactory{

	@Override
	public Service getService() {
		
		return new Implementation1();
	}
	
}


class Implementation2 implements Service{

	 Implementation2() {
		
	}
	@Override
	public void method1() {
		System.out.println("Implementation2.method1");
		
	}

	@Override
	public void method2() {
		System.out.println("Implementation2.method2");
		
	}
	
}

class Impelentation2Factory implements ServiceFactory{

	@Override
	public Service getService() {
		
		return new Implementation2();
	}
	
}


public class FactoriesMethod {

public static void serviceConsumer(ServiceFactory fact){
	Service s = fact.getService();
	s.method1();
	s.method2();
}
	public static void main(String[] args) {
		serviceConsumer(new Impelentation1Factory());
		serviceConsumer(new Impelentation2Factory());

	}
//293
}
