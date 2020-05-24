class StaticBlock{
	static int[] arr= new int[10];//배열크기가 10인 정적 배열 arr 생성
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			/*
			 * 0.0 이상 1.0미만 사이 실수 숫자 난수 발생 -> *10하면 0.0이상 10.0미만
			 * int로 캐스팅(형변환)하면 소수점 이하는 버림 0이상 10미만 -> +1하면 1이상 11미만 즉 1에서 10 사이 임의 정수 숫자 난수가 발생
			 * 
			 */
		}
		
	}
}
public class ConsTest15 {

	public static void main(String[] args) {

		/*
		 * 문제 1) for 반복문을 사용해서 arr배열원소값의 누적합과 실수 평균값을 구하는코드
		 * 
		 */
		int sum=0;
		double avg =0.0;
		System.out.print("a의 값  : ");
		for(int a : StaticBlock.arr) {
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println();
		avg = (double)sum/StaticBlock.arr.length;
		System.out.println("누적 합 = "+ sum+", 실수 평균 값 = "+avg);
		
		System.out.println("/n===================================");
		int[] score= {100,90,90};
		/*
		 * 문제1) 배열 원소 누적합을 구하는 add()를 작성하고 합을 반환받아 출력
		 */
		
		int total = add(score);
		System.out.println("배열 원소 누적합 = " + total);
		System.out.println("=====================================");
		/*
		 * 문제 2) 1~10사이 자연수 중에서 3의 배수 총합을 구하는 프로그램 작성
		 */
		System.out.println("3의 배수 총합 = " +sum());
		
	}
	static int add(int[] score) {
		int total=0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		return total;
	}

	static int sum() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		return sum;
	}
}
