import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MaxExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("blue", 96);//아이디와 점수를 키, 값쌍으로 저장
		map.put("hong", 86);
		map.put("white", 92);
		
		String id=null;//최고 점수를 받은 아이디를 저장
		int maxScore=0;
		int totalScore=0;//점수 합계
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry: entrySet) {
			/*
			 * 과제물)1. 최고점수를 받은 아이디와 최고점수를 구하는 알고리즘 코드를 작성
			 * 		2. 점수 합계를 구하는 코드를 작성
			 * 		3. double 점수 평균을 구해 보세요 출력물은 점수합계, 평균점수, 최고점수, 최고점수를 받은 아이디를 각각 출력
			 */
			if(maxScore<entry.getValue()) {
				maxScore = entry.getValue();
				id = entry.getKey();
			}
			totalScore += entry.getValue();
		}

		
		System.out.println("점수합계 =" + totalScore+ ", 평균점수 = "+(double)totalScore/entrySet.size()+", 최고점수 ="+maxScore+", 최고점수를 받은 아이디 :"+id);
	}

}
