import java.util.HashSet;
import java.util.Set;

public class List12 {

	public static void main(String[] args) {
		int[] scoreArr= {10,20,30,40,50};
		/*
		 * 배열 자료구조 특징)
		 * 1. 배열은 고정된 크기의 단 하나의 타입으로 복수개의 원소값을 한꺼번에 저장할 수 있다.
		 * 
		 */
		System.out.println("scoreArr 배열 원소 개수 : "+scoreArr.length);
		for(int k:scoreArr) {
			System.out.println(k+" ");
		}
		System.out.println("\n==============================");
		
		Set set = new HashSet();
		/*
		 * java.util 패키지의 Set컬렉션 인터페이스 특징)
		 * 1. 가변적 크기의 복수개의 타입으로 하나 이상의 원소값을 한꺼번에 저장할 수 있다.
		 * 2. 저장된 원소값 순서를 유지하지 않는다.
		 * 3. 저장된 원소값 중복을 허용하지 않는다.
		 */
		set.add(10); set.add(10.2);
		set.add(10); set.add("이순신");
		set.add(true); 
		System.out.println("set컬렉션 크기: "+set.size()); //저장된 중복 원소값 10은 하나로 인식해서 중복값을 허용안함.
		System.out.println(set);
	}

}
