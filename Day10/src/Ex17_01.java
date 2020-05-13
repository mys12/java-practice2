class SubClass{
   int i = 3;
   void p() {   
      System.out.println("i = "+ i);
   }
}
public class Ex17_01 {

   public static void main(String[] args) {

      Object o = new SubClass();
      if(o instanceof SubClass) {
         System.out.print("다운캐스팅 >> ");
         SubClass foo = (SubClass)o;
         foo.p();
      }else {
         System.out.println("다운캐스팅 변환 실패");
      }
   }

}