class A {
	public A() {
		System.out.println("hello from a");
	}
}
class B extends A {
	public B() {
		super();
		System.out.println("hello from b");
	}
}
public class Ex16_08 {

	public static void main(String[] args) {

		A a = new B(); 
	}

}
