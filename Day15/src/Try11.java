class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
class NotExistIDException extends Exception{
	NotExistIDException(){}
	NotExistIDException(String message){
		super(message);
	}
}
public class Try11 {

	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch (Exception e) {

			/*
			 * 문제) 예외 에러 경고 메시지를 출력하는 문장을 작성
			 */
			System.out.println(e.getMessage());
			
		}//첫 번째 try~catch문
		try {
			login("blue","54321");
		} catch (Exception e) {
			//작성코드
			System.out.println(e.getMessage());
		}
	}
	static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		/*
		 * 문제1) id가 blue가 아니라면 인위적 예외를 발생해서 경고 메세지를 띄우는 코드를 작성
		 * 문제2) 비번이 12345가 아니라면 인위적 예외를 발생해서 경고 메시지를 띄우는 코드를 작성
		 */
		 if(!id.equals("blue")) {
			 throw new NotExistIDException("아이디가 일치하지 않습니다.");
		 } 
		 if(!password.equals("12345")) {
			 throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
		 }
	}

}
