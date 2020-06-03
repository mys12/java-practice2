import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Member5{
	private String name;
	private String job;
	
	Member5(String name, String job){
		this.name=name;
		this.job=job;
		
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}
	
}
public class StreamEx16 {
	public static void main(String[] args) {
		List<Member5> list = Arrays.asList(
				new Member5("홍길동","개발자"),
				new Member5("홍길순", "웹디자이너"),
				new Member5("신용권", "개발자")
				);
		//Member5에서 직업이 개발자인 사람만 별도로 수집해서 List생성
		List<Member5> developersList = list.stream()
				.filter(m->m.getJob().equals("개발자"))
				.collect(Collectors.toList());
	
		//개발자 이름 출력
		developersList.stream().forEach(m->System.out.print(m.getName()+" "));
		System.out.println();
		//Member5를 직업별로 그룹핑해서 이름으로 매핑후 수집하여 컬렉션 생성, 결국 직업별 이름을 구함
		Map<String, List<String>> groupingMap = list.stream()
				.collect(
						Collectors.groupingBy(
								Member5 :: getJob, //매개변수 메서드 참조
								Collectors.mapping(Member5 :: getName, Collectors.toList())
								)
						);
		System.out.println(groupingMap);
		System.out.println();
		System.out.print("[개발자 이름 ] : ");

		groupingMap.get("개발자").stream().forEach(m-> System.out.print(m+" "));
		
		System.out.print("\n[웹 디자이너 이름] : ");
		groupingMap.get("웹디자이너").stream().forEach(m->System.out.print(m+" "));
	}

}
