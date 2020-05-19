class Gu{
	public void guguDan() {
		//코드 작성
		int a=2;
		System.out.println("===================================================================");
		while(a<=9) {
			System.out.print(a+"단\t");
			a++;
		}
		System.out.println("\n===================================================================");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(j*i) + "\t");
				
			}
			System.out.println();
		}
	}
}//Gu class
public class Ex1_01 {
	public static void main(String[] args) {
		Gu g=new Gu();//new로 객체생성
		g.guguDan(); 
	}
}