import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student3{
	public enum Sex { //열거형 상수
		MALE,
		FEMALE
	}
	public enum City{Seoul, Pusan}
	
	private String name;
	private int score;
	private Sex sex;
	private City city;//열거형 상수로 참조타입 멤버변수 선언
	
	Student3(String name, int score, Sex sex){
		this.name =name;
		this.score=score;
		this.sex=sex;
	}
	
	Student3(String name, int score, Sex sex, City city){
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Sex getSex() {
		return sex;
	}
	public City getCity() {
		return city;
	}
	
	
}
public class StreamEx11 {

	public static void main(String[] args) {

		List<Student3> totalList = Arrays.asList(
				new Student3("홍길동",10,Student3.Sex.MALE),
				new Student3("김수애",6,Student3.Sex.FEMALE),
				new Student3("신용권",10,Student3.Sex.MALE),
				new Student3("박수미",6,Student3.Sex.FEMALE)
				);
		
		//남학생만 묶어서 컬렉션 List생성
		List<Student3> maleList = totalList.stream()
										   .filter(s->s.getSex()==Student3.Sex.MALE)//남학생만 필터링
										   .collect(Collectors.toList());//수집해서 컬렉션을 만듬
		maleList.stream().forEach(s->System.out.println(s.getName()));//남학생만 출력
		System.out.println();

		//여학생만 묶어서 컬렉션 List생성
		Set<Student3> femaleSet = totalList.stream()
				                            .filter(s->s.getSex()==Student3.Sex.FEMALE) //여학생만 필터링
				                            .collect(Collectors.toCollection(HashSet :: new)); //생성자 참조
		femaleSet.stream().forEach(s->System.out.println(s.getName())); //여학생만 출력
		System.out.println();
		
		
		
	}

}
