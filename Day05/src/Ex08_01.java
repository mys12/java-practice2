
public class Ex08_01 {

	public static void main(String[] args) {

		
		for(int i=100; i>=1; i--) {
			if(i%7==0) {
				System.out.println("제일 큰 7의 배수: " +i);
				break;
			}
		}
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			sum=sum+i;
		}
		System.out.println("1+2+4+5 = "+sum);
	}

}
