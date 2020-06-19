class GenericClass<T>{//제네릭 클래스=><T>는 정해지지 않은 가상의 제네릭 T타입 선언. 보통 영문대문자 한글자
	private T member;

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
	
}
public class ListMap03 {

	public static void main(String[] args) {

		GenericClass<Integer> gc01= new GenericClass<>();
		gc01.setMember(100);//오토박싱은 되고 업캐스팅 문법은 없다.
		System.out.println(gc01.getMember());
		
		GenericClass<String> gc02 = new GenericClass<>();
		gc02.setMember("seoul");
		String cityName=gc02.getMember();//다운캐스팅 안함.
		System.out.println("서울 : "+gc02.getMember().toUpperCase());
	}

}
