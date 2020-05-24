
public class CastTest03 {

	public static void main(String[] args) {
		Father01 f = new Child01();//사전에 업캐스팅
		Child01 ch;
		ch=(Child01)f;//다운캐스팅
		
		ch.f01();//상속받아서 호출
		ch.ch01();//자손클래스 메서드 호출
		
		Child01 ch2=(Child01)f;//명시적인 다운캐스팅
		ch2.f01();
		ch2.ch01();
	}
}
