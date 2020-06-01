
public class Ex07_01 {

	public static void main(String[] args) {
		int cnt=0;
		int sum=0;
		for(int i=22; i<=76; i++) {
			if(i%2==0) {
				sum +=i;
				cnt++;
			}
		}
		System.out.println("짝수의 개수 : " + cnt+ ", 그 합 : " + sum);
	}
}
