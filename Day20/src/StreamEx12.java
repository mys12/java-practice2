import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamEx12 {

	public static void main(String[] args) {
		List<Student3> totalList = Arrays.asList(
				new Student3("홍길동",10,Student3.Sex.MALE,Student3.City.Seoul),
				new Student3("홍길순",13,Student3.Sex.FEMALE,Student3.City.Pusan),
				new Student3("이순신",10,Student3.Sex.MALE,Student3.City.Pusan),
				new Student3("신지향",13,Student3.Sex.FEMALE,Student3.City.Seoul)
				);
		
		//학생 성별로 그룹핑 수집한 List를 생성하는 맵생성
		Map<Student3.Sex,List<Student3>> mapBySex = totalList.stream()
															 .collect(Collectors.groupingBy(Student3 :: getSex));//매개변수 메서드 참조
		//학생 성별로 그룹핑해서 수집
		
		System.out.println("[남학생 이름] : ");
		mapBySex.get(Student3.Sex.MALE).stream()
		.forEach(s->System.out.print(s.getName()+" ")); //남학생 이름 출력
		
		System.out.println("\n[여학생 이름] : ");
		mapBySex.get(Student3.Sex.FEMALE).stream()
		.forEach(s->System.out.print(s.getName()+" "));//여학생 이름 출력
	}

}
