class Car02{
	String company ="현대자동차";
	String model;
	String color;
	int speed;
	
	Car02(){
		
	}
	Car02(String model, String color){
		this(model,color,120);
	}
	Car02(String model, String color, int speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	
	void p() {
		System.out.println("제조사: "+company);
		System.out.println("모델 : "+model);
		System.out.println("차 색상: "+color);
		System.out.println("최대 속도: "+speed);
	}
}
public class ConsTest02 {

	public static void main(String[] args) {

		Car02 c=new Car02("아반떼","파랑");
		c.p();
		
	}

}
