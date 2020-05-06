
public class Condi01 {

	public static void main(String[] args) {

		int score = 93;
		if(score >=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A등급");
		}
		if(score <90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B등급");
		/*
		 * if 조건문에서 실행문장이 한줄 이상일때는 반드시{} 블록단위로 묶어야 한다. 하지만 실행문장이 한줄인 경우는
		 * 블록을 해도 되고 안해도 된다. 안한경우는 한줄 실행문장만 실행된다.
		 */
	}

}
