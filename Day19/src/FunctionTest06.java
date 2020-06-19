
public class FunctionTest06 {

	public static void main(String[] args) {

		/*
		 *문제)1.람다식을 이용하여 Runnable 인터페이스를 구현한 스레드를 만들어 for 반복문으로 1부터 7까지 출력되는 스레드 문장을 만들어 보자.
		 * 2. 람다식을 이용하여 Thread 클래스를 구현한 스레드를 만들어 마찬가지로 while 반복문을 사용한 1부터 5까지의 누적합을 구해서 출력
		 */
		
		//1.
		Runnable run = () ->{
			for(int i=1;i<=7; i++) {
				System.out.print(i+ " ");
			}
		};
		new Thread(run).start();
		
		//2.
		Thread th1 = new Thread( () ->  {
			int i=1;
			int sum=0;
			while(i<=5) {
				sum+=i;
				i++;
			}
			System.out.println("누적합 = "+sum);
		});
		th1.start();


	}

}
