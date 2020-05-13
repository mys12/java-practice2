class Car03{
	int gas; //필드=> 멤버변수 중 인스턴스 변수, 속성
	
	// 매개 변수가 없는 기본생성자를 자바 컴파일러가 묵시적 제공을 한다.
	
	void setGas(int gas) {
		this.gas=gas;
	}//setter() 메서드=> 값 저장 메서드=> set+멤버변수명() 접미사로 붙는 멤버변수 첫글자는 영문 대문자
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량 : "+gas+")");
				gas -=1;//가스 잔량은 1씩 감소
			} else {
				System.out.println("멈춥니다.(gas잔량 : " +gas+")");
				return;//메서드 실행 종료
			}
		}//무한루프문=>영원히 반복하는문
	}//run()
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}//ifLeftGas() 메서드
}
public class ConsTest04 {

	public static void main(String[] args) {

		Car03 myCar = new Car03();
		myCar.setGas(5);//가스 주입
		boolean re= myCar.isLeftGas();//가스가 있다면 true, 없다면 false
		if(re==true) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		if(myCar.isLeftGas()) {//==true가 생략됨
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
