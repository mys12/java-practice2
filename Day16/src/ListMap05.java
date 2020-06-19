import java.util.Vector;

public class ListMap05 {

	public static void main(String[] args) {
		Vector<String> list=new Vector<>();
		list.add("apple");
		list.add("grape");
		
		Vector<? extends Object> objlist;
		/*
		 * <? extends Object>은 제네릭 와일드카드 문법으로 Object 타입을 상속받은 자손은 형변환을 허용
		 */
		objlist=list;
		for(Object obj:objlist) {
			String fruit=(String)obj;
			System.out.println(fruit.toUpperCase());
		}
	}

}
