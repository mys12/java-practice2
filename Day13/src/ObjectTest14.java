import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectTest14 {

	public static void main(String[] args) {
		Date now = new Date();//Date는 날짜를 표현하는 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//년 월 일 시 분 초 출력형태 객체 생성
		String now2=sdf.format(now);
		System.out.println(now2);
		
	}

}
