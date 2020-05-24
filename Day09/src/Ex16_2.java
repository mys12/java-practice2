class Parent{
	private int a;
	int b;
	protected int c;
	public int d;
	
}

class Child extends Parent{
	public Child(int a, int b, int c, int d) {
//		this.a=a;//[1]
		this.b=b;//[2]
		this.c=c;//[3]
		this.d=d;//[4]
	}
	void func() {
//		System.out.println(a); //[5]
		System.out.println(b); //[6]
		System.out.println(c); //[7]
		System.out.println(d); //[8]
	}
}
public class Ex16_2 {

	public static void main(String[] args) {

		Child one = new Child(1,2,3,4);
		one.func();
//		System.out.println(one.a);//[9]
		System.out.println(one.b);//[10]
		System.out.println(one.c);//[11]
		System.out.println(one.d);//[12]
		
		/*
		 * 1,5,9 => 내 자신 클래스에서만 접근 가능하기 때문에 에러 발생
		 */
	}

}
