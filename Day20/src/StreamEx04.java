import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx04 {

	static int sum=0;
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(
				new Student("홍길동",10),
				new Student("이순신",20),
				new Student("유미선",30)
				);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s-> System.out.println(s.getName()));
		
		System.out.println();
		
		String[] strArray= {"홍길동","신용권","김미나"};
		Stream<String> strStream = Arrays.stream(strArray);//배열로 부터 문자열 객체 타입요소를 처리하는 스트림 생성
		strStream.forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		int[] intArray = {10,20,30,40,50};
		IntStream intStream = Arrays.stream(intArray);//배열로 부터 int 타입 요소를 처리하는 스트림 생성
		intStream.forEach(num->System.out.print(num+" "));
		
		System.out.println();
		
		IntStream stream2 = IntStream.rangeClosed(1, 100);//1부터 100까지 순차적으로 제공하는 IntStream 생성
		stream2.forEach(k-> sum+=k);//누적합
		System.out.println("총합 ="+sum);
		
	}

}
