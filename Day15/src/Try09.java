public class Try09 {
	static void findClass() throws ClassNotFoundException{
		Class clazz= Class.forName("java.lang.String2");
	}
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException ce){
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
