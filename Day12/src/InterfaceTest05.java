interface IHello05{
	void hello(int k);
}
interface IGoodBye05{
	void arrSum(int[] arr);
}
interface ITotal extends IHello05, IGoodBye05{
	//인터페이스에서 인터페이스간의 상속은 extends 예약어를 사용한다
	void greeting(String name);//public abstract가 생략됨
}
class SubClass05 implements ITotal{

	@Override
	public void hello(int k) {
		System.out.println(k+"단");
		for(int i=1; i<=9;i++) {
			System.out.println(k+" * " + i + " = "+(k*i));
		}
		System.out.println();
	}

	@Override
	public void arrSum(int[] arr) {
		int sum=0;
		
		for(int a: arr) {
			sum += a;
		}
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
		System.out.println("100+200+300 = "+ sum);
		System.out.println();
	}

	@Override
	public void greeting(String name) {
		System.out.println(name + "님 반가워요");
	}
	
	
}
public class InterfaceTest05 {

	public static void main(String[] args) {

		/*
		 * 문제) 각각의 추상메서드를 오버라이딩을 해서 구구단 중에 9단 값, 100+200+300의 배열 원소 누적합, 홍길동님 반가워요 라는 값을 출력되게 하는 코드 작성
		 */
		SubClass05 s = new SubClass05();
		s.hello(9);
		int[] arr = {100,200,300};
		s.arrSum(arr);//arr 배열은 참조 타입이기 때문에 번지 주소값이 전달.
		s.greeting("홍길동");
	}

}
