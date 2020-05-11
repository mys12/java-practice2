class Parent2{
	protected int a,b,c;
	
	public Parent2() {
	
		super();//최고 조상 Object 클래스의 기본 생성자 호출 => 묵시적 생략을 할 수 있다.
		System.out.println("Parent2 클래스 생성자 호출");
	}
	public Parent2(int a, int b, int c) {
		System.out.println("Parent2 클래스 매개변수 3개짜리 오버로딩 된 생성자");
		this.a=a; this.b=b; this.c=c;
	}
}
class Child2 extends Parent2{
	public Child2() {
		System.out.println("자손 클래스 Child2 기본 생성자 호출");
	}
	public Child2(int a, int b, int c) {
		super(a,b,c); //조상클래스 오버로딩 된 생성자 호출
		System.out.println("Child2 오버로딩 된 생성자 호출");
	}
	void print() {
		System.out.println("a= "+a +", b="+b+", c= "+c);
	}
}
public class Ex16_03 {

	public static void main(String[] args) {

		Child2 one = new Child2();
		one.print();
		
		Child2 two = new Child2(10,20,30);
		two.print();
	}

}
