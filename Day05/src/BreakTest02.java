
public class BreakTest02 {

	public static void main(String[] args) {

		/*
		 * 이중 for 반복문에서 break문을 만나면 가장 근접한 맨 안쪽 반복문만 중단을 시키고
		 * 바깥 반복문은 중단 못하고 계속 반복한다. 이러한 문제점을 해결하기 위해서 바깥쪽 반복문위에
		 * 임의의 레이블(라벨)명을 붙여서 이중 for 반복문을 강제 중단시킨다.
		 * break 라벨 이름;
		 */
		
		int a,i;
		for(a=1;a<=5;a++) {
			for(i=1; i<=5;i++) {
				if(i%3==0) {
					break;//맨 안쪽 가장 근접한 반복문만 중단하고 바깥 반복문은 중단못하고 계속 반복
				}
				System.out.print(" i -> " +i);
			}
			System.out.println("\n a->"+a);
		}
		System.out.println("=======================================");
		
		exit_for:
			for(a=1; a<=3; a++) {
				for(i=1; i<=3; i++) {
					if(i%3==0) {
						break exit_for;
					}
					System.out.print(" i ->" +i);
				}
				System.out.println("\n a->"+a);
			}
	}

}
