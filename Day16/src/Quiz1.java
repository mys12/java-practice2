
public class Quiz1 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=1; i<=100; i++) {
			
			sum = (i%3==0)? sum+=i : sum;
		}
		System.out.println("1~100까지 3의 배수의 합: " + sum);
	}

}
