class Util{
	static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}//제네릭 메서드
}
public class Generic02 {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int result = box1.getT();
		System.out.println("반환된 값 = "+result);
		
	}

}
