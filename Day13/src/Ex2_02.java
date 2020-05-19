class Mt02{
	void pr(int a) {
		System.out.println(a);
	}
	void pr(int ... a) { //가변인자로 변경
		for(int arr : a) {
			System.out.print(arr + " ");
		}
	}
}
public class Ex2_02 {
	public static void main(String[] args) {
		Mt02 m=new Mt02();
		m.pr(10);
		m.pr(10, 20);
	}
}