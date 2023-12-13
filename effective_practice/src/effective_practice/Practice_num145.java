package effective_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

public class Practice_num145 {
	
	  // 버그를 찾아보자.
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }

    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    Suit suit;
    Rank rank;
    
    Practice_num145(Suit suit, Rank rank ) {
        this.suit = suit;
        this.rank = rank;
    }

    enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }
    

	public static void main(String[] args) {
		
		Collection<Face> faces = EnumSet.allOf(Face.class);

	    for (Face faces1 : faces) 
	        for (Face faces2 : faces) 
	        	System.out.println(faces1 + "," + faces2);
		
		List<Practice_num145> deck = new ArrayList<>();
        
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
                deck.add(new Practice_num145(i.next(), j.next()));
	

		
//		Iterable<Element> c = null;
		
		List<Element> elements = new ArrayList<>();
		
//		for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
//			
//		    Element e = i.next();
//		    
//		    // 반복자 1: c.iterator()
//		    // 반복자 2: i.hasNext()
//		    // 반복자 3: i.next()
//		}
		
		for (Element e:  elements) {
			
		}
		
		int[] elements2 = {1, 2, 3, 4, 5};
		
//		for (int i = 0; i < a.length; i++) {
//			// 인덱스 1: int i = 0;
//		    // 인덱스 2: i < a.length
//		    // 인덱스 3: i++
//		    // 인덱스 4: a[i]
//		}
		
		for (int e:  elements2) {
			
		}
		
		 

	        
	}
	

}
