import java.util.Arrays;
import java.util.List;

public class StreamEx06 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("홍길동","신용권","감자바","신용권","신민철");
		
		names.stream()
			 .distinct()//중간처리 메서드 ->이름에서 중복 제거
			 .forEach(name->System.out.print(name+" "));
		
		System.out.println("\n===========================");
		
		names.stream()
			 .filter(n->n.startsWith("신")) //중간처리 메서드 -> 신으로 시작되는 이름만 필터링
			 .forEach(n-> System.out.print(n+" "));
		
		System.out.println("\n===========================");
		//중복이름을 제거하고 신으로 시작되는 이름만 출력
		names.stream()
			 .distinct() //중복 이름 제거
			 .filter(n->n.startsWith("신")) //신으로 시작되는 이름만 필터링
			 .forEach(n-> System.out.print(n + " "));
	}

}
