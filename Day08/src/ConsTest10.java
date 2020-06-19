class St02{
	private static int a=10;
	//static으로 정의된 정적변수 a
	private int b=20;//인스턴스 변수
	
	public static void setA(int new_a)
	{
		a=new_a;
	}//static 키워드로 정의된 setA를 정적메서드라고 한다. 정적 메서드는 해당 클래스명으로 직접접근 할  수 있다.
	//그래서 클래스 메서드라고도 함.
	
	public static int getA() {
		return a;
	}
}
public class ConsTest10 {

	public static void main(String[] args) {

		St02 s = new St02();
		s.setA(100);
		System.out.println("s.getA() = "+ s.getA());
		St02.setA(1000);
		System.out.println("St02.getA() = " + St02.getA());
	}

}
