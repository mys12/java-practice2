class Car01{
	String company="현대자동차";
	String model; //차모델
	String color; //차색상
	int maxSpeed; //최고속도
	
	 Car01(){
		 
	 }
	 
	 Car01(String model){
		 this.model=model;
	 }
	 Car01(String model, String color){
		 this.model=model;
		 this.color=color;
	 }
	 Car01(String model, String color, int maxSpeed){
		 this.model=model;
		 this.color=color;
		 this.maxSpeed=maxSpeed;
		 
	 }
	void print() {//인스턴스(객체) 메서드는 생성된 객체에 의해 모두 공유된다.
		System.out.println("제조사: "+company);
		System.out.println("모델 : "+model);
		System.out.println("차 색상: "+color);
		System.out.println("최대 속도: "+maxSpeed);
	}
	
}
public class ConsTest01 {

	public static void main(String[] args) {

		Car01 c01=new Car01();
		System.out.println("c01.company:" +c01.company);
		System.out.println();
		
		Car01 c02=new Car01("자가용","빨강");
		System.out.println("c02.company:"+c02.company);
		System.out.println("c02.model:"+c02.model);
		System.out.println("c02.color:"+c02.color);
		System.out.println();
		
		Car01 c03=new Car01("택시","검정",200);
		/*
		 * 문제) c03.model로 접근하는 것은 보안상 좋지 않다. 그러므로
		 * Car01 클래스에 void print(){}메서드를 정의해서
		 * 생성된 객체로 접근하여 제조사, 모델, 차색상, 최대속도를 출력하게 코드 완성		
		 */
		c03.print();
	}

}
