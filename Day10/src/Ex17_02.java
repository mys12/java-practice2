class Super{//슈퍼 클래스
   public void p(int a) {
      System.out.println("a = " +(a+1));
   }
}
class CastingEx03 extends Super{//서브클래스

	@Override
	public void p(int a) {
		System.out.println("a = " +(a+2));
	} 

//   public void p(int a) { //오버라이딩
//      System.out.println("a = "+(a+2));
//   }
}
public class Ex17_02 {

   public static void main(String[] args) {

      Super a = new CastingEx03(); //업캐스팅
      a.p(0);
   }

}