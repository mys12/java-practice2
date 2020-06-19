import java.util.Arrays;
import java.util.List;

class Member3{
	private String name;
	private int age;
	
	Member3(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
public class StreamEx15 {

	public static void main(String[] args) {
		List<Member3> list = Arrays.asList(
				new Member3("홍길동",30),
				new Member3("이순신",40),
				new Member3("감자바",26)
				);
		double avg = list.stream()
				.mapToInt(Member3 :: getAge) //Member3에서 나이를 int 타입으로 구하는 중간처리 메서드
				.average()//평균
				.getAsDouble();//평균을 실수 숫자로 반환
		
		System.out.println("평균 나이 = "+avg);
	}

}
