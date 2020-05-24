class Person{
	final String NARA="Korea";//final로 선언된 변수는 수정할 수 없는 변수 즉 상수가 됨
	//상수는 선언과 동시에 초기화를 해야하고 관례적으로 영문대문자로 한다.
	final String JUMIN;
	String name;
	
	
	Person(String JUMIN, String name){
		this.JUMIN=JUMIN;
		this.name=name;
	}
	void print() {
		System.out.println("국가명: " +NARA);
		System.out.println("주민번호: " +JUMIN);
		System.out.println("사람이름 : " +this.name );//this. 은 생략가능
	}
}

class Earth{
	static final double RADIUS=6400;//static final은 정적 상수
}

public class FinalTest01 {

	public static void main(String[] args) {

		Person p = new Person("123456-23456789","이순신");
		p.print();
		System.out.println(Earth.RADIUS);
		
	}

}
