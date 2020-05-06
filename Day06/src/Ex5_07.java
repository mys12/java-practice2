
public class Ex5_07 {

	public static void main(String[] args) {

		int max = 0;//최대값을 저장할 변수
		int[] array = {1,5,3,8,2};
		/*
		 * 문제) array 배열에서 최대값을 구하는 알고리즘 코드를 완성
		 */
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("최대값  = " + max);
	}

}
