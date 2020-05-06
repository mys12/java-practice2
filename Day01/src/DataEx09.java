
public class DataEx09 {

	public static void main(String[] args) {
		
		float f1 = 1F;//A
//		float f2 =1.0;//B
		float f2 =(float)1.0;//=>1.0은 double 실수 숫자 타입값을 float 타입변수에 저장 못함.
		float f3='1';//C => 자동형변환(자동산술법) => byte->short(char)->int->long->float->double 타입 크기 순으로 형변환
//		float f4="1";//D
		float f4='1';//=>"D"는 문자열 참조타입. 기본 타입과 참조타입간의 형변환은 안됨
//		float f5=1.0d;//E
		float f5=(float)1.0d; //double 실수 숫자 타입값을 float 타입변수에 저장 못함 
		// 답 : A, C
		/*
		 * B : 숫자 뒤에 F,f를 붙여야한다.
		 * D : String 타입이 float타입보다 크기때문에 값을 담을 수 없다.
		 * E :float 타입에는 f를 붙여야한다.
		 */
		
	}

}
