class Point10{
	int x=10;
	int y=20;
	
	Point10(int x, int y){
		this.x = x;
		this.y = y;
	}
	void p1() {
		System.out.println("x= "+x+", y= "+y);
	}
}

class Point11 extends Point10{
	int z = 30;
	Point11(){
		this(100,200,300);//같은 클래스내의 다른른 생성자 호출
	}
	Point11(int x, int y, int z){
		super(x,y); //조상클래스의 오버로딩 된 생성자 호출
		this.z=z;
	}

	void p() {
		System.out.println("x= "+x+", y= "+y+", z="+z);
	}
}
public class FinalTest09 {

	public static void main(String[] args) {

		Point11 p = new Point11();
		p.p();
		p.p1();
		Point11 p1 = new Point11(1000,2000,3000);
		p1.p();
		p1.p1();
	}

}
