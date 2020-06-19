import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx13 {

	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
				new Student3("홍길동",10, Student3.Sex.MALE),
				new Student3("김수애",12, Student3.Sex.FEMALE),
				new Student3("신용권",10, Student3.Sex.MALE),
				new Student3("박수미",12, Student3.Sex.FEMALE)
				);
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student3.Sex, Double> mapBySex = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student3 :: getSex, 
								Collectors.averagingDouble(Student3 :: getScore)//매개변수 메서드
								//참조, 점수 평균
								)
						);
		System.out.println("남학생 평균 점수 : "+mapBySex.get(Student3.Sex.MALE));
		System.out.println("여학생 평균 점수 : "+mapBySex.get(Student3.Sex.FEMALE));
	}
	

}
