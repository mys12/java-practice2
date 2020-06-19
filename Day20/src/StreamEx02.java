import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	Student(String name, int score){
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

public class StreamEx02 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("이순신",100)
				);//asList()메서드는 배열을 컬렉션 List로 변경
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName(); 
			int score = s.getScore();
			System.out.println("학생이름 : "+name+", score: "+score);
		});//forEach()메서드가 반복해주는 루핑 최종 처리 메서드
		
	}

}
