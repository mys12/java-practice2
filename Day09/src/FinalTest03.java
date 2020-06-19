class Parent03{
	//extends Object 최고조상 클래스로부터 묵시적 상속을 받는다.
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}

class Child03 extends Parent03 {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
public class FinalTest03 {

	public static void main(String[] args) {

		Child03 c = new Child03();
		c.setX(100); //상속 받아서 사용
		c.setY(200);
		c.setZ(300); //자손 클래스 메서드 사용
		
		/*
		 * 클래스 상속 문법
		 * class 자손 클래스 extends 조상(부모, 슈퍼)클래스{}
		 * extends예약어로 하나의 조상으로부터만 단일 상속만 받는다.
		 */
		System.out.println("x="+c.getX()+", y="+c.getY()+", z="+c.getZ());
		
		
		new Parent03();
		
		
	}

}
