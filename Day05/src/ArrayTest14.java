
public class ArrayTest14 {

	public static void main(String[] args) {

		int[] score = new int[3];//배열 크기가 3인 score 배열 생성
		
		for(int i=0; i<score.length; i++) {
			score[i]=(i+1)*10;//배열 원소값 저장
			
		}
		//향상된 확장 for
		for(int a : score) {
			System.out.print(a + " ");
			
		}
		System.out.println("\n=========================================");
		
		int[] arr= {10,20,30,40,50}; //배열 원소값을 직접 초기화 하면서 arr 배열 생성
		int sum =0;//배열 원소 누적합
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("arr 배열 원소 누적합="+sum);
	}

}
