
public class DataEx06 {

	public static void main(String[] args) {
		byte b= 127;
		byte c= 126;
		byte d =(byte)(b+c);
		int d1 = b+c;
		System.out.println("d의 값 : " +d);
		System.out.println("d1의 값 : " +d1);
		/*
		 * byte+byte는 자동 산술법에 의해서 가장 덧셈 연산 속도가 빠른 int형으로 자동형변환 해서 덧셈연산을 수행
		 * byte d에 b+c의 값을 저장하려면 강제 형변환 시켜야 한다.
		 * int 덧셈결과값을 byte 타입변수에 형변환해서 저장하면 byte타입 범위를 벗어나 잘못된 값이 저장됨
		 */
	}
}
