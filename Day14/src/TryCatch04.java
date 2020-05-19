class Member{
	String id="aaaaa";
	String name="홍길동";
	
}
public class TryCatch04 {

	public static void main(String[] args) {
		Member m = null;//m참조 변수에는 번지 객체주소가 저장안됨.
		try {
			System.out.println(m.id+","+m.name);
		}catch(Exception e) {
			System.out.println("예외 발생 : "+e);
			m=new Member();//객체주소가 저장된 참조변수=> 객체명
			System.out.println("아이디:"+m.id+",이름:"+m.name);
		}
	}

}
