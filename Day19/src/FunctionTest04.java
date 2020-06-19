interface MyFunctionalInterface4{
	void method();
}

class UsingThis{
	int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void m() {
			//람다식
			MyFunctionalInterface4 fi = () -> {
				System.out.println("outterField : "+outterField);
				System.out.println("outterField : "+UsingThis.this.outterField+"\n");
				System.out.println("innerField : "+innerField);
				System.out.println("innerField : "+this.innerField);
			};
			fi.method();
		}
	}//인스턴스 멤버 중첩클래스=>외부클래스$내부클래스명.class(UsingThis$Inner.class)
}
public class FunctionTest04 {

	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.m();
	}
}
