class Button{
	OnClickListener listener;//멤버변수
	
	void setOnClickListener(OnClickListener listener) { //다형성
		this.listener=listener;//멤버변수 초기화
	}
	
	void touch() {
		listener.onClick();//업캐스팅 후 오버라이딩 된 메서드 호출
	}
	interface OnClickListener{
		void onClick();//추상메서드
	}//중첩 인터페이스 => Button$OnClickListener.class
}

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}//첫번째 자손 클래스
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
	
}
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());//첫번째 자손 이벤트 등록
		btn.touch();
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
