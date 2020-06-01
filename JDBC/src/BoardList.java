import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardList {
   

   public static void main(String[] args) {

      String driver= "oracle.jdbc.driver.OracleDriver";//oracle.jdbc.driver는 패키지명
      String url ="jdbc:oracle:thin:@localhost:1521:xe";
      String user="week";//오라클 접속 사용자
      String pwd="week";
      Connection con = null;//오라클 연결 참조변수
      Statement st = null;//쿼리문 수행 참조 변수
      ResultSet rs = null;//검색 결과 레코드를 저장할 참조 변수
      String sql = null;//쿼리문을 저장할 변수

      Scanner sc = new Scanner(System.in);

      try {

         /*
          * 게시물 목록 소스를 작성하여 다음과 같은 출력 결과물이 나오게 한다.
          * 번호       제목       작성자    내용       등록날짜(년월일만 나오게한다.)
          * 7        제목01   이순신   내용01    2020_05_22
          */
         
         Class.forName(driver);
         con=DriverManager.getConnection(url,user,pwd);
         st=con.createStatement();//쿼리문 수행 st생성
         sql = "select b_no,b_title,b_name,b_cont,b_date from boardT";
         rs = st.executeQuery(sql);
         
         SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd");
         System.out.println("번호\t"+"제목\t작성자\t내용\t등록날짜");
         
         while(rs.next()) {
            int b_no = rs.getInt("b_no");
            String b_title = rs.getString("b_title");
            String b_name = rs.getString("b_name");
            String b_cont = rs.getString("b_cont");
            String b_date = sdf.format(rs.getDate("b_date"));
            System.out.printf("%d\t%s\t%s\t%s\t%s", b_no,b_title,b_name,b_cont,b_date);
            System.out.println();
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {

         try {
            if(sc != null) sc.close();
            if(rs != null) rs.close();
            if(st != null) st.close();
            if(con != null) con.close();
         }catch(Exception e) {
            e.printStackTrace();
         }
      }
   }

}