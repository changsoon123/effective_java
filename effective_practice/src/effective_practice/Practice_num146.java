package effective_practice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;

public class Practice_num146 {

	static Random rnd = new Random();

	static int random(int n) {
	   return Math.abs(rnd.nextInt()) % n;
	}
	
	public static void main(String[] args) throws IOException {
		
		try (InputStream in = new URL(args[0]).openStream()) {
		      in.transferTo(System.out);
		   }
		
		int n = 2 * (Integer.MAX_VALUE / 3);
		   int low = 0;
		   for (int i = 0;i < 1000000; i++)
		      if (random(n) < n/2)
		         low++;
		   System.out.println(low);
	}

}
