package unsynchronized;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {//계산기 메모리에 값을 저장시키는 메서드
		this.memory=memory;
		try {
			Thread.sleep(2000);//스레드를 2초간 일시정지
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : "+this.memory);
		//Thread.currentThread().getName()은 현재 실행중인 스레드 이름을 반환
	}
}
