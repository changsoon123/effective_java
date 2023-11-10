package effective_practice;

import java.util.HashSet;
import java.util.Set;

public class Practice_num104 {

		private final char first;
	   private final char second;
	   
	   public Practice_num104(char first, char second) {
	      this.first = first;
	      this.second = second;
	   }
	   
	   @Override
	   public boolean equals(Object o) {
		  
		  if(!(o instanceof Practice_num104))
			  return false;
		  
		  Practice_num104 b = (Practice_num104) o;
	      return b.first == first && b.second == second;
	     
	   }
	   
	   public int hashCode() {
	      return 31 * first + second;
	   }
	
	public static void main(String[] args) {
		
		Set<Practice_num104> s = new HashSet<>();
		
	      for (int i=0;i<10;i++)
	         for (char ch = 'a'; ch<='z'; ch++)
	            s.add(new Practice_num104(ch, ch));
	      System.out.println(s.size());
		
		
	}

}

