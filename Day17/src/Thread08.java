class CalcThread extends Thread{

	CalcThread(String name){
		setName(name);//스레드이름을 변경 설정
	}//생성자 오버로딩
	@Override
	public void run() {
		for(int i=1;i<=2000000000;i++) {}//20억번 루핑 즉 반복
		System.out.println(getName());//getName()으로 스레드 이름을 반환
	}//스레드 문장구현
	
}
public class Thread08 {

	public static void main(String[] args) {
		for(int i =1;i<=10; i++) {
			Thread th = new CalcThread("thread"+i);//thread1~thread10까지 스레드 이름 생성
			if(i != 10) {//1부터 9까지 인경우 실행
				th.setPriority(Thread.MIN_PRIORITY);//가장 낮은 우선순위를 1로 설정
				//MIN_PRIORITY 정적상수는 스레드 우선순위값이 1
			}else {//10일때 실행
				th.setPriority(Thread.MAX_PRIORITY);//가장 높은 우선순위 10으로 설정
				//MAX_PRIORITY 정적 상수는 스레드 우선순위값 10
			}//if else
			th.start();
		}//for
	}

}
