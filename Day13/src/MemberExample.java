class Member2{
	private String id;//회원아이디
	private String name;//회원이름
	
	Member2(String id, String name){
		this.id=id;
		this.name=name;
	}//생성자가 오버로딩되면 매개변수가 없는 기본생성자를 자바 컴파일러는 묵시적 제공하지 않는다.
	/*
	 * 문제 ) '아이디=aaaa, 회원이름= 홍길동'으로 추력되게 추가 코드를 한다.
	 */

	@Override
	public String toString() {
		return "아이디 = "+id+", 회원이름 = "+name;
	}
	
	
}
public class MemberExample {

	public static void main(String[] args) {

		Member2 member = new Member2("aaaaa","홍길동");
		System.out.println(member);
	}

}
