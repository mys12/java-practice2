class Animal02{
	String name;
	private int age;//private 접근 권한 제어자로 선언된 age 멤버변수는 Animal02 클래스 밖에서 접근 못함
	
	public int getAge() {
		return age; //멤버 변수값을 return으로 getAget()메서드 호출한 곳으로 반환
	}
	public void setAge(int new_age) {
		age=new_age;
	}
	
	
}

public class ObjectTest02 {
	public static void main(String[] args) {
	
		Animal02 a = new Animal02();
		a.name="홍길동"; a.setAge(26);
		System.out.println("이름 : " + a.name + ", 나이 : "+a.getAge());
	}
}
