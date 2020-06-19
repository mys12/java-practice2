
public class OprData11 {

	public static void main(String[] args) {
		int a=10, b=10;
		System.out.println(++a);//먼저 1을 증가하고 11이 출력
		System.out.println(a);
		
		System.out.println(b++);
		System.out.println(b);
		
		a=b=10;
		int c;
		c=++a;//먼저 1을 증가한 11 값이 c 변수에 저장
		System.out.println(c);
		
		c=b++;//먼저 10을 저장하고 나중에 1증가
		System.out.println(c);//10
		System.out.println(b);//11
		
		int i = 5, j=5;
		System.out.println(i++);//5
		System.out.println("i = " +i);//6
		
		System.out.println(++j);//6
		System.out.println("j = " +j);//6
	}
}
