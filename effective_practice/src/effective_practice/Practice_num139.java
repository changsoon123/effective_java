package effective_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice_num139 {

	private static Practice_num139 shop = new Practice_num139();
	
	private final List<Cheese> cheesesInStock = new ArrayList<>();

	/**
	 * @return 매장 안의 모든 치즈 목록을 반환한다.
	 * 단, 재고가 하나도 없다면 null을 반환한다.
	 */
//	public List<Cheese> getCheeses() {
//	    return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock); 
//	}
	
//	public List<Cheese> getCheeses() {
//	    return new ArrayList<>(cheesesInStock);
//	}
	
//	public List<Cheese> getCheeses() {
//	    return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
//	}
	
//	public Cheese[] getCheeses() {
//	    return cheesesInStock.toArray(new Cheese[0]);
//	}
	
//	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
//
//	public Cheese[] getCheeses() {
//	    return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
//	}
	public Cheese[] getCheeses() {
		
	return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
	
	}
	
	public static void main(String[] args) {

		
//		List<Cheese> cheeses = shop.getCheeses();
//		
//		if (cheeses != null && cheeses.contains(Cheese.STILTON)) {
//		    System.out.println("좋았어, 바로 그거야.");
//		} else {
//            System.out.println("원하는 치즈가 없어요.");
//        } 

		Cheese[] cheeses = shop.getCheeses();
		
		for (Cheese cheese : cheeses) {
	        if (Cheese.STILTON.equals(cheese)) {
	            System.out.println("좋았어, 바로 그거야.");
	            return; 
	        }
	    }
		
		System.out.println("원하는 치즈가 없어요.");
		
		
		
	}

}

class Cheese {

	public static final Object STILTON = new Object();
	
}