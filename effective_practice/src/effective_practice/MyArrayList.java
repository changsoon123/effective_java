package effective_practice;

import java.util.AbstractCollection;
import java.util.Iterator;

public class MyArrayList<E> extends AbstractCollection<E> implements MyCollections<E> {

    private Object[] elements; // 요소를 저장하기 위한 배열
    private int size; // 컬렉션의 현재 크기

    public MyArrayList(int initialCapacity) {
        elements = new Object[initialCapacity];
        size = 0;
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            // 컬렉션 크기가 배열 크기와 같다면 배열 크기를 확장
            int newCapacity = (size * 3) / 2 + 1;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        // 요소를 삭제하는 구현
        // 필요에 따라 구현
        return false;
    }

    @Override
    public boolean contains(Object o) {
        // 요소가 포함되어 있는지 확인하는 구현
        // 필요에 따라 구현
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        // Iterator를 반환하는 구현
        // 필요에 따라 구현
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}


