class Animal{
	protected String kind;
	protected int leg;
	
	public Animal(){
		
	}
	
	public Animal(String kind, int leg){
		this.kind = kind;
		this.leg = leg;
	}
	
	public void getKind() {
		if(kind.equals("소녀")) {//equals()메서드는 내용물 값만 비교
			System.out.println(kind+"는 사람이다.");
		}else {
			System.out.println(kind+"는 동물이다.");
		}//if else
	}//getKind()
	
	public void walk() {
		if(leg==2) {// 기본타입 ==로 비교하면 값을 비교
			System.out.println("사람은 "+leg+"발로 걷는다.");
		}else {
			System.out.println("강아지는 "+leg+"발로 걷는다.");
		}//if else
	}//walk
}//Animal class

class Human extends Animal{
	public Human(){
		
	}
	
	public Human(String kind, int leg){
		super(kind, leg);//조상 Animal 클래스 오버로딩 된 생성자 호출
	}
}//Human class

class Dog extends Animal{
	public Dog(){
		
	}
	public Dog(String kind, int leg){
		super(kind, leg);
	}
}// Dog class

public class Ex16_15 {

	public static void main(String[] args) {
		
		Dog d = new Dog("강아지",4);
		Human h=new Human("소녀",2);
		
		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}
	
}
