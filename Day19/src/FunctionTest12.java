import java.util.function.ToIntBiFunction;

public class FunctionTest12 {

	static void print(int order) {
		if(order < 0) {
			System.out.println("사전순으로 먼저 옵니다.");
		}else if(order == 0) {
			System.out.println("동일한 문자열입니다.");
		}else {
			System.out.println("사전순으로 나중에 옵니다.");
		}//if else if
	}
	public static void main(String[] args) {
		ToIntBiFunction<String,String> function;
		function = (a,b) -> a.compareToIgnoreCase(b);
		//compareToIgnoreCase()메서드는 두 문자열을 대소문자 상관없이 동일한 알파벳으로 구성되었는지를 비교
		//사전순으로 a가 b보다 먼저 오면 음수, 동일하면 0, 나중에 오면 양수를 반환
		print(function.applyAsInt("Java8", "java8"));
		
		//매개변수 원래 타입 메서드 참조
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA8"));
	}

}
