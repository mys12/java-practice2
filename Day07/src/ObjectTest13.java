class Member13{
	String id;//아이디=> 기본 값 null
	String name;//회원이름
	int age;// 나이=> 기본값 0
	boolean result; //기본값 false
	
	/*
	 * 생성자의 주된 기능은 new 클래스명()에 의해서 호출되는 멤버변수 직접 초기화
	 */
	Member13(){
		id="aaaaa"; 
		name="이순신";
		age=27;
	}
	void print() {
		System.out.println("아이디="+id+",이름="+name+",age="+age);
		System.out.println("result="+result);
	}
}
public class ObjectTest13 {

	public static void main(String[] args) {

		Member13 m = new Member13();
		m.print();
		
	}

}
