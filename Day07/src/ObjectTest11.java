class Mt11{
	void p(int a, int b) {
		if(a>b) {
			System.out.println(a+"와 "+b+" 중 최대값 = "+a);
		}
	}
	void p(double a, double b) {
		if(a<b) {
			System.out.println(a+"와 "+b+" 중 최소값 = "+a);
		}
	}//매개변수 타입을 다르게 한 메서드 오버로딩
}

public class ObjectTest11 {

	public static void main(String[] args) {

		Mt11 m = new Mt11();
		m.p(20, 10);
		m.p(10.0, 20.0);
	}

}
