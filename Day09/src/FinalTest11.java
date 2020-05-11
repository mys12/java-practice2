import java.lang.reflect.Method;

public class FinalTest11 {

	public static void main(String[] args) {

		//Service 클래스로 부터 메서드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		// Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation이 적용되었는지 확인
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				//PrintAnnotation 객체 얻기
				System.out.println("["+method.getName()+"]");//메서드명 출력
				for(int i=0; i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());//구분선 출력
				}//for
				System.out.println();//줄바꿈=>개행
				/*
				 * try~catch문은 예외 처리
				 */
				try {
					method.invoke(new Service());//메서드 호출
				}catch(Exception e) {}
				System.out.println();
						
			}//if
		}//for
	}

}
