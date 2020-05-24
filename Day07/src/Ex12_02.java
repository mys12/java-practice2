class Mp3{
	private String comp;
	private int size;
	
	/*
	 * 1. 매개변수가 없는 기본 생성자가 생략됨(자바컴파일러가 기본제공)
	 * 2. 생성자 이름은 클래스명과 같다.
	 */
	public String getComp() {
		return comp;
	}
	public void setComp(String new_comp) {
		comp = new_comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int new_size) {
		size=new_size;
	}
	
	
}
public class Ex12_02 {

	public static void main(String[] args) {

		Mp3 m = new Mp3();
		m.setComp("갑을회사"); m.setSize(8);
		System.out.println("회사명 : "+m.getComp());
		System.out.println("메모리 용량 : "+m.getSize()+"G");
	}

}
