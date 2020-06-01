class Container<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
public class Generic08 {

	public static void main(String[] args) {
		Container<String> con1 = new Container<>();
		con1.setT("홍길동");
		String str = con1.getT();
		System.out.println(str);
		
		System.out.println("-------------------------");
		Container<Integer> con2 = new Container<>();
		con2.setT(10);
		int value = con2.getT();
		System.out.println(value);
		/*
		 * 문제) 제네릭 클래스 Container를 만들고 멤버변수 t를 정의하고 setter(), getter()메서드를 정의
		 */
	}

}
