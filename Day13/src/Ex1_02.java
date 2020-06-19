class ConsTest{
	int a;

	ConsTest(){}
	ConsTest(int a){
		this.a=a;
		System.out.println("a="+a);
	}
}//CosTest class

class Ex1_02{
	public static void main(String[] args){
		new ConsTest();
	}
}