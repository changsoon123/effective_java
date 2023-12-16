package effective_practice;

import java.math.BigDecimal;

public class Practice_num147 {

	public static void main(String[] args) {

		int funds = 100;
		
	    int itemBought = 0;
	    
	    for (int price = 10; funds >= price ; price += 10) {
	        funds -= price;
	        itemBought++;
	    }
	    
	    System.out.println(itemBought + "개 구입");
	    System.out.println("잔돈(달러):" + funds);
		
	}

}
