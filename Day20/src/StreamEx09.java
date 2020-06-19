import java.util.Arrays;
import java.util.OptionalDouble;

public class StreamEx09 {
	static int sum =0;
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5})//int[]배열로 IntStream 객체 생성
						   .filter(n->n%2==0) //2의 배수
						   .count();//count()는 최종 처리 메서드로 2의 배수를 카운터한다.
		System.out.println("2의 배수 개수 : "+count+" 개");
		
		int sum = Arrays.stream(new int[] {1,2,3,4,5})
						 .filter(n->n%2==0)
						 .sum();
		System.out.println("2의 배수 합 = "+sum);
		
		//문제) 1부터 10까지 배열원소값에서 double 실수 숫자 1 3 5 7 9 홀수 평균값을 double 타입으로 구해보자
		double avg = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10})
						   .filter(n->n%2==1)
						   .average()
						   .getAsDouble();
		System.out.println("평균 ="+avg);
		double avg1 = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10})
				   .filter(n->n%2==1)
				   .peek(n->System.out.print(n+" "))
				   .average()
				   .getAsDouble();
		System.out.println("\n"+avg1);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5})
						.filter(n->n%2==0)
						.max()
						.getAsInt();//2의 배수 최대값을 int로 저장
		System.out.println("최대값 ="+max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5})
						.filter(a->a%2 ==0)
						.min()
						.getAsInt();
		System.out.println("최소값 ="+min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5})
						  .filter(a -> a%3 ==0)
						  .findFirst()
						  .getAsInt();
		System.out.println("3의 배수 첫번째 원소값 = "+first);
		
	}

	
}
