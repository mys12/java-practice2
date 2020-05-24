
class Animal{
	protected String kind;
	protected int leg;

	public Animal() {

	}
	public Animal(String kind, int leg) {
		this.kind=kind;
		this.leg=leg;
	}


	public void getKind() {
//		if(kind.equals("강아지")) {
//
//			System.out.println(kind+" 동물이다.");
//		} else {
//			System.out.println(kind+ " 사람이다.");
//		}
	}
	public void walk() {
		System.out.println(kind+"는 "+leg+"발로 걷는다.");
	}
}

class Dog extends Animal{

	Dog(){

	}
	Dog(String kind, int leg){
		super(kind, leg);
	}

	
	@Override
	public void getKind() {
		System.out.println(kind+" 동물이다.");
	}
	
	
	public void bike() {

	}

}

class Human extends Animal{

	Human(){

	}
	Human(String kind, int leg){
		super(kind, leg);
	}
	
	
	@Override
	public void getKind() {
		System.out.println(kind+ " 사람이다.");
	}
	
	public void speak() {

	}
}
public class Ex16_04 {

	public static void main(String[] args) {
		Dog d = new Dog("강아지",4);
		Human h=new Human("소녀",2);

		d.getKind();
		d.walk();
		h.getKind();
		h.walk();


	}

}