package staticConstructorInstantInitializationBlock;

public class A {
	
	A(){
		System.out.println("A");
	}
	
	{
		System.out.println(1);
	}
	
	static {
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		
		new A();
		
	}

}
