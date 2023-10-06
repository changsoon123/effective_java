package effective_practice;



public class Practice_num49{

	public static void main(String[] args) {

	}

}

interface Singer {
	
	AudioClip sing(Song s);
	
}


interface Songwriter {
	
	Song compose(int chartPosition);
	
}

interface SingerSongwriter extends Singer, Songwriter{
	
	AudioClip strum();
	void actSensitive();
	
}

