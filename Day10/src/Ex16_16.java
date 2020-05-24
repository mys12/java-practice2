class HandPhone{
	protected String model;//폰모델명
	protected String number;
	
	public HandPhone() {
		
	}
	public HandPhone(String model, String number) {
		this.model=model;
		this.number=number;
	}
}//HandPhone class

class DicaPhone extends HandPhone{
	protected String pixel;
	
	public DicaPhone() {
		
	}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명 : "+model+"\t번호 : "+ number+"\t화소수 : "+pixel);
	}
}
public class Ex16_16 {

	public static void main(String[] args) {

		 DicaPhone dp = new DicaPhone("갤럭시 폴더", "010-3831-6666","1024");
	      dp.prnDicaPhone();
	}

}
