import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		System.out.println("가지고 싶은 물건을 입력하세요.");
		System.out.println("입력을 중지하려면 <그만>이라고 입력하세요.");
		int count =0;
		while(true) {
			System.out.print("> ");
			String thing = sc.nextLine();
			if(thing.equals("그만")) {
				break;
			}
			arr[count] = thing;
			count++;

		}
		System.out.println("입력종료!!");
		System.out.print("내가 가지고 싶은 물건들 : [");
		for(int i=0; i<count; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");

	}

}
