class Mt{
	void p(int a) {
		System.out.println(a);
	}
	int a(int a) {
		return a;
	}
}
public class Ex2_011 {
	public static void main(String[] args) {
		Mt m=new Mt();
		m.p(10);
		int re=m.a(10);
	}
}