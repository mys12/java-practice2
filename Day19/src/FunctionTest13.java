import java.util.function.BiFunction;
import java.util.function.Function;

class Member2{
	private String name;
	private String id;
	
	public Member2() {
		System.out.println("Member2() 실행");
	}
	public Member2(String id) {
		System.out.println("Member2(String id) 실행");
		this.id = id;
	}
	Member2(String name, String id){
		System.out.println("Member2(String name, String id) 실행");
		this.name=name;
		this.id=id;
	}
}
public class FunctionTest13 {

	public static void main(String[] args) {
		Function<String,Member2> function1 = Member2 :: new;//생성자 참조
		Member2 member1 = function1.apply("java8");//매개변수 1개짜리 오버로딩된 생성자 호출
		
		BiFunction<String, String, Member2> function2 = Member2 :: new;
		Member2 member2 = function2.apply("java", "oracle");//매개변수 2개짜리 오버로딩 된 생성자 호출
	}

}
