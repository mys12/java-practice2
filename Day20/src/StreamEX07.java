import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEX07 {

	public static void main(String[] args) {

		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);//int[] 배열로부터 IntStream 객체 생성
		intStream
				 .asDoubleStream()//IntStream int 타입 요소를 double 타입 요소로 형변환 해서 DoubleStream을 생성하는 중간 처리 메서드
				 .forEach(d->System.out.print(d+" "));
		System.out.println("\n===============================");
		
		/*
		intStream
		 .asDoubleStream()//IntStream int 타입 요소를 double 타입 요소로 형변환 해서 DoubleStream을 생성하는 중간 처리 메서드
		 .forEach(d->System.out.print(d+" "));
		*/
		
		intStream = Arrays.stream(intArray);
		intStream
				 .boxed() //int를 Integer 래퍼 참조타입으로 오토박싱을 해서 Stream<Integer>를 생성하는 중간처리 메서드
				 .forEach(obj-> System.out.println(obj.intValue()));//intValue()메서드는 기본타입 int로 변환
		
		
	}

}
