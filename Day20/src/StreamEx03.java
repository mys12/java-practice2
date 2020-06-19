import java.util.Arrays;
import java.util.List;

public class StreamEx03 {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",98),
				new Student("이순신",100),
				new Student("신사임당",100)
				);
		
		double avg = studentList.stream()//스트림 객체 생성
				.mapToInt(Student :: getScore)//매개변수 메서드 참조, Student를 int타입으로 변환하면서 학생점수를 구함. 중간 처리 메서드
				.average()//최종 처리 메서드=> 평균을 구함
				.getAsDouble(); //평균을 실수로 변경
		
		System.out.println("평균 점수 : "+avg);
	}

}
