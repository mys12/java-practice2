
public class ArrayTest15 {

	public static void main(String[] args) {

		String[] names = {"Kim","Park","Yi"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"] = " + names[i]);
			
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		names[0] = "Yu";// 첫 번째 배열 원소값을 Kim에서 Yu로 변경
		
		System.out.println("---------------------------------------");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
