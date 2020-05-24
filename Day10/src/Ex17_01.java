class SubClass{
   int i = 3;
   void p() {   
      System.out.println("i = "+ i);
   }
}
public class Ex17_01 {

   public static void main(String[] args) {

      Object o = new SubClass();//업캐스팅
      if(o instanceof SubClass) {
         System.out.print("다운캐스팅 >> ");//다운캐스팅이 가능하면 참
         SubClass foo = (SubClass)o; //명시적인 다운캐스팅
         foo.p();
      }else {
         System.out.println("다운캐스팅 변환 실패");
      }
   }

}