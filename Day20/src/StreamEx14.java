import java.util.Arrays;
import java.util.List;

public class StreamEx14 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		
		list.stream()
		.filter(s->s.toLowerCase().contains("java"))//영어소문자로 변경후 "java"단어가 포함된 문자열 요소를 필터링
		.forEach(s->System.out.println(s));
	}

}
