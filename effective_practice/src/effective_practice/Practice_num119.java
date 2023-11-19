package effective_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice_num119 {

	private static List<Card> newDeck() {
		 return Stream.of(Suit.values())
		            .flatMap(suit ->
		                    Stream.of(Rank.values())
		                            .map(rank -> new Card(suit, rank))
		            )
		            .collect(Collectors.toList());
		}
	
	public static void main(String[] args) {
		 newDeck();
		
		"Hello world!".chars().forEach(x -> System.out.print((char) x));
		
	}

}

class Suit {

	public static Suit[] values() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Rank{

	public static Rank[] values() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Card {

	public Card(Suit suit, Rank rank) {
		// TODO Auto-generated constructor stub
	}
	
}