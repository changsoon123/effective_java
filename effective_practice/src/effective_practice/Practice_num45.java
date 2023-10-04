package effective_practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Practice_num45<E> extends HashSet<E> {
	
	
    private int addCount = 0; // 추가된 원소의 수

    public Practice_num45() {
    }

    public Practice_num45(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
    	addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
    	addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
    
    	Practice_num45<String> s = new Practice_num45<>();
    	s.addAll(List.of("틱", "탁탁", "펑"));
    	
    	System.out.println(s.getAddCount());
    }
}