import java.util.Arrays;
import java.util.List;

class Student2{
	private String name;
	private int score;
	
	Student2(String name, int score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
}
public class StreamEx10 {
	public static void main(String[] args) {

		List<Student2> studentList= Arrays.asList(
				new Student2("홍길동",92),
				new Student2("이순신",95),
				new Student2("강감찬",88)
				);
		int sum1 = studentList.stream().mapToInt(Student2 :: getScore)/*매개변수 메소드 참조로 점수를 구함*/.sum();
		System.out.println("점수 합 = "+sum1);
		
		int sum2 = studentList.stream()
							  .map(Student2 :: getScore)
							  .reduce((a,b)->a+b)
							  .get();
		System.out.println("점수 합 = "+sum2);
		
		int sum3 = studentList.stream()
				.map(Student2 :: getScore)
				.reduce(0,(a,b)->a+b); //디폴트 즉 기본값으로 주어진 초기값 0에 +92+95+88
		System.out.println(sum3);
	}

}
