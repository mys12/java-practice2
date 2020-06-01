import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class ListMap10 {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호 입력하세요.");
			System.out.print("아이디 >> ");
			String id= sc.nextLine();//아이디를 문자열로 입력받음
			
			System.out.print("비밀번호 >> ");
			String password=sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {//맵에 아이디 키가 포함되어 있다면 참
				if(map.get(id).equals(password)) { //아이디에 해당하는 비번을 가져와 비교
					System.out.println("로그인 되었습니다!");
					break;
				}else {
					System.out.println("비번이 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다!");
			}//if else
			
		}//while

	}//main

}
