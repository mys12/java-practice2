class MyDate12 {
	private int year; //년도
	private int month; //월
	private int day;
	
	/*
	 * 생성자 특징)
	 * 1. 생성자 이름은 클래스명과 같다.
	 * 2. 생성자명 앞에 리턴 타입이 없다.
	 */
	MyDate12(){
		System.out.println("매개변수가 없는 기본생성자 호출");
	}
	
	void pr() {
		System.out.println(year+"/"+month+"/"+day);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
public class ObjectTest12 {

	public static void main(String[] args) {

		MyDate12 m = new MyDate12();
		m.pr();
	}

}
