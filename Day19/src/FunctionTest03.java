@FunctionalInterface
interface MyFunctionalInterface03{
	int method(int x, int y);//매개변수가 있고, 리턴값이 있는 추상메서드
}
public class FunctionTest03 {

	public static void main(String[] args) {
		MyFunctionalInterface03 fi;
		
		fi = (x,y) -> {
			int re =x+y;
			return re;
			
		};
		int result = fi.method(2,5);
		System.out.println("2 + 5 = "+result);
		
		fi = (int x, int y) -> {return x*y;};
		System.out.println("10 * 10 = "+fi.method(10, 10));
		
		fi = (int x, int y) -> x+y;//return문만 있는 경우 {}와 return 생략가능
		fi.method(5, 5);
		System.out.println("5 + 5 = "+result);
		
		fi = (int x, int y) -> sum(x,y);
		System.out.println("10 + 5 = "+fi.method(10, 5) );
	}
	
	static int sum(int a, int b) {
		return a+b;
	}

}
