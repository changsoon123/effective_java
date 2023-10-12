package effective_practice;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

public class Practice_num61 {

	
	
	public static void main(String[] args) {

		
		
	}

}

//코드 24-1 비정적 멤버 클래스의 흔한 쓰임 - 자신의 반복자 구현
class MySet<E> extends AbstractSet<E> {


@Override public Iterator<E> iterator() {
 
	return new MyIterator();

}

private class MyIterator implements Iterator<E> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}

}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
}