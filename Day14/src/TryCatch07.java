class UserException extends Exception {
	UserException(String message){
		super(message);//조상 클래스 오버로딩 된 생성자를 호출하면서 메시지를 전달
	}
}
public class TryCatch07 {

	public static void main(String[] args) {
		try {
			int a=-11;
			if(a<0) {
				throw new UserException("양수가 아닙니다.");
			}
		} catch (UserException ue) {//실행 예외
			System.out.println(ue.getMessage());// getMessage()메서드로 예외 에러 메시지 출력
		}
	}
}
