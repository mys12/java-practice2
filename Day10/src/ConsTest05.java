class HandPhone05{
	String model;//모델명
	String number;//폰번호
	
	HandPhone05(){}
	
	HandPhone05(String model, String number){
		this.model=model;
		this.number=number;
	}//생성자 오버로딩
}// HandPhone class

class DicaPhone05 extends HandPhone05{
	String pixel;//화소수
	
	DicaPhone05(String model, String number, String pixel){
		super(model,number);
		this.pixel=pixel;
	}
	
	void prn() {
		System.out.println("모델명: "+model+", 폰번호: "+number+", 화소수: "+pixel);
	}
}
public class ConsTest05 {
	public static void main(String[] args) {
		DicaPhone05 dp = new DicaPhone05("갤럭시20","010-555-5555","1024");
		dp.prn();
		
		if(dp instanceof HandPhone05) {
			/*
			 * instanceof 연산자 특징)
			 * 1. 참조변수 instanceof 클래스타입은 해당 참조변수가 클래스타입으로 형변환(업캐스팅/다운캐스팅)이 가능하면 true, 가능하지 않으면 false
			 * 2. instanceof 연산자를 형변환유무 판단 연산자
			 */
			  System.out.println("조상타입으로 업캐스팅이 가능함");
			  HandPhone05 hp=dp;//업캐스팅
		}
		HandPhone05 hp = new HandPhone05();
		if(hp instanceof DicaPhone05) {
			System.out.println("다운캐스팅이 가능함");// hp는 사전에 업캐스팅을 하지 않았기 때문에 다운 캐스팅이 불가능하다.
			DicaPhone05 dp2 = (DicaPhone05)hp;
		}else {
			System.out.println("다운캐스팅 불가능함");
		}
		System.out.println("------------------------------------------------");
		/*
		 * 문제) instanceof 연산자를 사용하여 hp3객체를 업캐스팅 한 다음에 다운캐스팅을 dp3으로 prn()메서드를 호출하여
		 * 모델명 : 갤럭시 폴더, 폰번호 :010-7777-9999, 화소수 :2048 결과값을 출력하는 코드 완성
		 */
		HandPhone05 hp3 = new DicaPhone05("갤럭시 폴더","010-7777-9999","2048"); //업캐스팅
		
		if(hp3 instanceof DicaPhone05) { //다운캐스팅이 가능하면 true
			System.out.println("다운캐스팅이 가능함");
			DicaPhone05 dp3 =(DicaPhone05)hp3;//명시적인 다운캐스팅
			dp3.prn();
		} else {
			System.out.println("다운캐스팅이 불가능함");
		}
		
	}

}
