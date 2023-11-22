package effective_practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static java.util.Comparator.comparing;
import static java.util.function.BinaryOperator.maxBy;

public class Practice_num123 {

	
	
	
	
	public static void main(String[] args) {
		
		
		Artist a = new Artist("a", "1");
        Artist b = new Artist("b", "2");
        Artist c = new Artist("c", "3");

        List<Album> albums = List.of(
            new Album(a, 1),
            new Album(a, 2),
            new Album(b, 3),
            new Album(c, 4)
        );

        Map<Artist, Album> topHits = albums.stream().collect(
    			toMap(Album::artist, album -> album, (a1,b1) -> b1));
        
        
				System.out.println(topHits);
		
	}

}

class Artist{
	private String name;
    private String nickname;

    public Artist(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Album{
	 private Artist artist;
	    private int sales;

	    public Album(Artist artist, int sales) {
	        this.artist = artist;
	        this.sales = sales;
	    }

	    public Artist artist() {
	        return artist;
	    }

	    public int sales() {
	        return sales;
	    }

	    @Override
	    public String toString() {
	        return Integer.toString(sales);
	    }
	
}