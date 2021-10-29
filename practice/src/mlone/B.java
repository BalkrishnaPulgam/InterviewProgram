package mlone;

public class B extends A {

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		a.m1();
		a.m2();
		
		
		B b = new B();
		b.m1();
		b.m2();
	}

}
