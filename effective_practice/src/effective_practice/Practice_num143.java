package effective_practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* An instrument section of a symphony orchestra.
*/
enum OrchestraSection {
    /** Woodwinds, such as flute, clarinet, and oboe. */
    WOODWIND,

    /** Brass instruments, such as french horn and trumpet. */
    BRASS,

    /** Percussion instruments, such as timpani and cymbals. */
    PERCUSSION,

   /** Stringed instruments, such as violin and cello. */
    STRING;
}

/**
* Indicates that the annotated method is a test method that
* must throw the designated exception to pass.
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExceptionTest10 {
    /**
    * The exception that the annotated test method must throw
    * in order to pass. (The test is permitted to throw any
    * subtype of the type described by this class object.)
    */
    Class<? extends Throwable> value();
}

public class Practice_num143 {

	/**
	 * This method compiles with the {@index IEEE 754} standard
	 */
	
	/**
	* An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
	*
	* (Remainder omitted)
	*
	* @param <K> the type of keys maintained by this map
	* @param <V> the type of mapped values
	*/
	public interface Map<K, V> {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
