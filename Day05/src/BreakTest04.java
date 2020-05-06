
public class BreakTest04 {

	public static void main(String[] args) {
		int sum=0, i=0;
		while(true) {
			if(sum>100) {
				break;//반복문 중단
			}
			++i;//선행증가
			sum+=i;//누적합
		}
		System.out.println("i="+i+", sum="+sum);
		
		/*
		 * 문제) for, continue문을 사용해서 1부터 10사이 중에서 3,6,9만 빼고 출력하는 코드를 작성
		 */
		for(i =1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
