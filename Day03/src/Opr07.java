
public class Opr07 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = (++x) + (y--);//x 변수값 11을 먼저 1증가한 11+20=31을 z변수에 저장한 다음 나중에 y변수값을 후행 증가
		System.out.println("z = " + z + ", x = " +x+ ", y = " +y); // x = 11, y = 19, z = 31
		
		System.out.println("--------------------");
		
		int pencils = 534; //총 연필개수
		int students = 30; //학생수
		
		/*
		 * 학생 한명당 가지는 연필수를 구해서 출력하고, 그런 다음 남은 연필수도 구해서 각각 구하는 코드를 작성
		 */
		 int pencil = pencils/students;
		 int restPencil = pencils%students;
		 System.out.println("학생 한명당 가지는 연필수 : "+pencil+", 남은 연필수  : " + restPencil);
		 
	}

}
