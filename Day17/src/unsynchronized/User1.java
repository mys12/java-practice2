package unsynchronized;

public class User1 extends Thread {
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");//스레드 이름 설정
		this.calculator = calculator;
	}//이클립스 메뉴로 setter()메서드만 정의


	@Override
	public void run() {
		calculator.setMemory(100);//메모리 값 100저장
	}

}
