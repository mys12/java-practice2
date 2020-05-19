import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		
		String tel = "02-8888-9999";
		//'-' 구분자를 기준으로 폰번호를 분리=>분리된 폰번호를 토큰 문자열이라고 한다.(회원정보 수정창)
		//split()=>첫 번째 방법
		String[] phoneArr=tel.split("-");//-를 기준으로 폰번호를 분리해서 문자열 배열로 반환
		for(String p : phoneArr) {
			System.out.println(p);
		}
		
		/*
		 * 문제) java.util패키지의 StringTokenizer클래스를 활용하여 폰번호를 분리해서 다음과 같이 출력되게 한다,
		 * 출력예) 010
		 * 		 8888	
		 *		 9999
		 */
		System.out.println();
		System.out.println("======================");
		StringTokenizer st = new StringTokenizer(tel,"-");
		while(st.hasMoreTokens()) { //hasMoreTokens() => 토큰이 남아있으면 true 없으면 false
			System.out.println(st.nextToken()); //nextToken() => 토큰 문자열을 가져와 출력
		}
		System.out.println();
		System.out.println("======================");
		StringTokenizer st1 = new StringTokenizer(tel,"-");
		int count = st1.countTokens(); //전체 토큰의 수
		for(int i=0; i<count; i++) {
			String phone = st1.nextToken();
			System.out.println(phone);
		}
	}

}
