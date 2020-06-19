import java.util.Arrays;

public class StreamEx08 {

	public static void main(String[] args) {

		int[] intArr = {1,2,3,4,5};
		
		System.out.println("[peek()를 마지막 호출한 경우]");
		Arrays.stream(intArr) //int[] 타입 배열로 IntStream객체 생성
			  .filter(num -> num %2 ==0) //2의 배수를 구함
			  .peek(num->System.out.println(num));//peek()는 요소 전체를 반복해주는 중간 처리 메서드. 중간처리 메서드는 최종처리 메서드를 호출해야 동작한다. 
		//결국 최종 처리 메서드를 호출하지 않았기 때문에 해당 메서드는 실행 안함
		
		System.out.println();
		
		//문제 ) 메서드 체이닝 방법을 사용해서 2의 배수 값을 출력
		System.out.println("========================");
		System.out.println("[forEach()를 호출한 2의 배수 출력]");
		Arrays.stream(intArr)
			  .filter(num-> num%2 ==0)
			  .forEach(num->System.out.print(num+" "));//forEach()는 최종메서드이기 때문에 동작
		System.out.println();
		System.out.println("========================");
		System.out.println("[2의 배수 합]");
		
		int total = Arrays.stream(intArr)
						  .filter(num->num%2==0)
						  .peek(num->System.out.print(num+" "))
						  .sum();
		System.out.println("\n2의 배수 합 = "+total);
	}

}
