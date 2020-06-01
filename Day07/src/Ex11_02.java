class Product {
	private String name;
	private int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String new_name) {
		name= new_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int new_price) {
		price = new_price;
	}
	
}
public class Ex11_02 {

	public static void main(String[] args) {

		System.out.println("출력: 자판기 => 제품목록 :");
		Product p = new Product();
		p.setName("커피"); p.setPrice(150);
		System.out.println(p.getName()+ " "+p.getPrice()+"원,");
		
		p.setName("비타 500"); p.setPrice(500);
		System.out.println(p.getName()+ " "+p.getPrice()+"원");
		
		
		
	}

}
