
public class Opr03 {

	public static void main(String[] args) {

		int a=10,b=10;
		boolean result = false;
		
		result = (a == b); //기본타입 값을 ==로 비교하면 값을 비교한다.
		System.out.println(a+" == " +b+" : "+result);
		
		String pwd01 = "1234";
		String pwd02 = "1234";
		String pwd03 = new String("1234"); //new 연산 키워드로 새로운 객체명 pwd03을 생성함.
		//그러면 새로운 번지(객체주소)가 할당된다. 결국 pwd01과 pwd02는 같은 객체주소를 가리키고, pwd03은 객체 주소가 다르다.
		
		result = (pwd01==pwd02);//문자열 값을 ==로 비교하면 객체 주소값을 비교한다.
		System.out.println(pwd01+" == " +pwd02+ " : " + result);
		
		result = (pwd01==pwd03);
		System.out.println(pwd01 + " == " + pwd03+ " : " + result);
		//문자열 값 1234는 같은데 주소 값이 달라서 false
		
		result = pwd01.equals(pwd03); //String 클래스의 equals()메서드로 비교하면 문자열 값만 비교한다. =>true
		System.out.println("\""+pwd01 +"\""+ " equals(\""+pwd03+"\") : "+ result);
		
		
		
		
		
				
	}

}
