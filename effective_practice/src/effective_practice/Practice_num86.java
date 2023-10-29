package effective_practice;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Practice_num86 {

	public static void main(String[] args) {

		 Favorites f = new Favorites();
		 
		 List<String> pets = Arrays.asList("개", "고양이", "앵무");
		 
		 f.putFavorite(new TypeRef<List<String>>(){}, pets);
		 
		 List<String> listofStrings = f.getFavorite(new TypeRef<List<String>>() {});
		 
		 System.out.println(listofStrings);
	        
//	     f.putFavorite(String.class, "Java");
//	     f.putFavorite(Integer.class, 0xcafebabe);
//	     f.putFavorite(Class.class, Favorites.class);
//	       
//	     String favoriteString = f.getFavorite(String.class);
//	     int favoriteInteger = f.getFavorite(Integer.class);
//	     Class<?> favoriteClass = f.getFavorite(Class.class);
//	        
//	     
//	     System.out.printf("%s %x %s%n", favoriteString,
//	                favoriteInteger, favoriteClass.getName());
//	     
//	     HashSet<Integer> set = new HashSet<>();
//	     ((HashSet)set).add("문자열 입니다");
//	     System.out.println(set);
		
	}

}

class Favorites{
	
	private Map<Type, Object> favorites = new HashMap<>();

    public <T> void putFavorite(TypeRef<T> typeRef, T instance) {
        favorites.put(typeRef.getType(), instance);
    }

    public <T> T getFavorite(TypeRef<T> typeRef) {
        Object favorite = favorites.get(typeRef.getType());
        return typeRef.cast(favorite);
    }
}

class TypeRef<T> {
    private final Type type;

    protected TypeRef() {
        Type superClass = getClass().getGenericSuperclass();
        this.type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return this.type;
    }
    
    @SuppressWarnings("unchecked")
	public T cast(Object object) {
        return (T) object;
    }
}

//class ClassTest<T>{
//	T cast(Object obj) {
//		return null;
//	};
//}