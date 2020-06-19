class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class Try04 {

	static void changeDog(Animal animal) {//다형성(업캐스팅)
		/*
		 * 문제) 어떤 연산자 키워드와  if else if 다중 조건문을 사용하여 ClassCastException 런타임 실행 예외 오류를
		 * 안나게 즉 형변환 에러가 발생되지 않게 디버깅해서 정상 프로그램을 완성
		 */
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal; //명시적인 다운캐스팅
		}else if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
		}
		
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		changeDog(dog);
		
		changeDog(new Cat());
	}

}
