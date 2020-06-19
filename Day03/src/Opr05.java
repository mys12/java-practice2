
public class Opr05 {

	public static void main(String[] args) {

		int a = 12; //0000 1100
		int b= 20; // 0001 0100
		int c = a&b; // 0000 0100
		System.out.println(a+" & " +b +" : "+c ); // 4
		
		
		c = a|b; // 0001 1100
		System.out.println(a+ " | " +b +" : "+c); //28
		
		c = a^b; //0001 1000
		System.out.println(a+" ^ "+b +" : " +c);//24
		
		/*
		 * 보수 구하는 방법
		 * 1. ~a & x = 1111 1111
		 * => x = 0000 1100 (x를 구한다) 
		 * => 12+1 (1을 더해준다) 
		 * =>13  
		 * =>-13 (-을 붙여준다)
		 */
		
		c = ~a; // 1111 0011
		System.out.println("~"+ a + " : " +c); 
		
		/*
		 *  A<<B 
		 *  =>A*2^B
		 */
		byte x = 15; // 0000 1111
		System.out.println(x + " << 2 : " + (x <<2));//0011 1100 => 60
		/*
		 * 0011 1100
		 * 32+16+8+4 = 60
		 */
		
		System.out.println(x+ " >> 2 : " + (x>>2)); //0000 0011 =>3
		/*
		 * 0000 0011
		 * 2+1 = 3
		 * 
		 */
		System.out.println("-8 >> 3 : " + (-8 >>3));//-1
		
		System.out.println("-8 >>> 3 :" +(-8>>>3));
		
	
		
	} 

}
