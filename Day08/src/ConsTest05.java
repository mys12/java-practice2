class Calculator{
	int plus(int x, int y) {
		return x+y;
	}//덧셈
	
	double avg(int x, int y) {
		double sum=plus(x,y);//int 타입 덧셈결과값이 double타입 실수타입으로 자동형변환이 되어져서 덧셈 결과값 저장
		double result = sum/2; //double/int->double/doble->double(자동 산술법)
		return result;//평균이 몫과 나머지를 함께 구함
	}
	
	void execute() {
		double result = avg(7,10);
		print("평균= "+ result);
	}
	
	void print(String message) {
		System.out.println(message);
	}
}
public class ConsTest05 {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.execute();
		
	}

}
