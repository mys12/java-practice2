class Animal{
	protected String kind;
	protected int leg;
	
	public Animal() {
		
	}
	public Animal(String kind, int leg){
		this.kind=kind;
		this.leg=leg;
	}
	
	public void getKind() {
		
	}
	public void walk() {
		
	}
}

class Dog extends Animal{
	
	public void bike() {
		
	}
}

class Human extends Animal{
	public void speak() {
		
	}
}
public class Ex16_04 {

	public static void main(String[] args) {

		Dog d = new Dog("강아지", 4);
		Human h = new Human("소녀",2);
	}

}
