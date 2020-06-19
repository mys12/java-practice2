
public class ArrayTest11 {

	public static void main(String[] args) {

		/*
		 * 배열이란? 
		 * 1. 배열은 고정된 크기로서 동일한 단하나의 타입의 복수개의 원소값을
		 * 한꺼번에 저장할 수 있는 자료 구조
		 * 2. 배열생성법
		 * 		타입[] 배열명 = new 타입[배열크기];
		 * 3. 배열명.length 속성을 사용해서 배열 크기 즉 배열 원소 개수를 반환
		 * 4. 배열 주소 인덱스 번호는 0부터 시작한다.
		 */
		int[] score= new int[3];//배열크기가 3인 score 배열 생성
		
		score[0] =100;
		score[1] =100;
		score[2] =90;
		System.out.println("배열크기(원소개수) : " +score.length);
		//배열 원소값 출력
		for(int i=0; i<score.length; i++) {
			//i 초기값이 0부터 시작한 이유는 배열주소 인덱스 번호가 0부터 시작해서이다.
			System.out.print(score[i]+" ");
		}
		
		System.out.println("\n------------------------------------");
		
		//자바 1.5에서 추가된 향상된 확장 for반복문으로 배열 원소값을 출력
		for(int k: score) {
			System.out.print(k + " ");
			
		}
		/*
		 * 향상된 확장 for 반복문 형식
		 * for(타입 변수명: 배열명)
		 * 배열 원소 개수만큼 반복하면서 원소값을 가져와 변수에 저장해서 읽어온다.
		 * }
		 */
		
		
	}

}
