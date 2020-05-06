import java.util.Scanner;

public class Opr06 {

	public static void main(String[] args) {

		int result = 0;
		result +=10; // result = result+10;와 같다.
		System.out.println("result = "+result);//10
		
		result -= 5; //result = result-5; 10-5 =5
		System.out.println("result = "+result);
		
		result *= 3; //result = result*5; 5*3 =15
		System.out.println("result = "+result);
		
		result /= 5; //result = result/5; 15/5 =3
		System.out.println("result = "+result);
		
		result %= 3; //result = result%3; 3%3 =0
		System.out.println("result = "+result);
		
	
		/*
		 * 문제) java.util 패키지의 스캐너 클래스를 이용해서 0~100사이 임의의 정수 점수값 85를 입력 받는다.
		 * 3항 조건 연산자를 사용해서 점수가 90점 이상이면 'A'학점, 80점 이상이면 'B'학점, 80점 미만이면 'C'학점을
		 * 출력되게 한다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100사이 임의의 정수 점수값 입력: ");
		int score = sc.nextInt(); //nextInt() 메서드로 정수 숫자로 입력받는다.
		//char grade = ' '; //학점, 단일문자 초기화는 한칸 띄워서 ' '
		String grade = (score>=90? "A학점" : (score>=80 ? "B학점": "C학점" ));
		System.out.println(score + "점의 학점 : "+grade);
		
		sc.close();
	}

}
