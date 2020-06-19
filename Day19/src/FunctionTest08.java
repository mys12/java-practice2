import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

class Student{
	private String name;//학생명
	private int englishScore;//영어점수
	private int mathScore;//수학점수
	
	Student(String name, int englishScore, int mathScore){
		this.name=name;
		this.englishScore=englishScore;
		this.mathScore=mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
}
public class FunctionTest08 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90,96),
			new Student("이순신", 95, 93)
			);//asList()는 제네릭 메서드로
	
	static double avg(ToIntFunction<Student> function) {
		//ToIntFunction 함수형 인터페이스는 매개값과 리턴값이 있는 인터페이스로 매개값을 받아서 리터값으로 매핑 즉 타입 변환을 해준다.
		//객체 T를 int로 변환
		int sum=0;
		for(Student student : list) {
			sum+=function.applyAsInt(student);
		}
		double avg=(double)sum/list.size();//double/int는 자동산술법에 의해  double/double 나눗셈하면 몫과 나머지 까지 평균을 구함
		return avg;
		
	}
	public static void main(String[] args) {
		double englishAvg = avg(s ->s.getEnglishScore());
		System.out.println("영어 평균 점수 ="+englishAvg);
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("수학 평균 점수 ="+mathAvg);
		
		
	}
	   static double testAvg() {
		      
		      int sum = 0;
		      
		      ToIntFunction<Student> ifce = (Student s) -> {
		         return s.getEnglishScore();
		      };
		      for(Student student : list) {
		         sum += ifce.applyAsInt(student);
		      }
		      return 0.0;
		   }

}
