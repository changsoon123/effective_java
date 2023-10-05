package effective_practice;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Practice_num47<E> extends AbstractList<E> {
	
	private List<E> internalList;

    public Practice_num47(List<E> list) {
        this.internalList = list;
    }

    // removeRange 메서드를 고성능으로 구현
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        // 범위 내의 요소를 효율적으로 삭제하는 로직 구현
        if (fromIndex < 0 || toIndex >= size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        List<E> subList = internalList.subList(fromIndex, toIndex + 1);
        subList.clear(); // 부분리스트를 비움
    }

    @Override
    public E get(int index) {
        return internalList.get(index);
    }

    @Override
    public int size() {
        return internalList.size();
    }
	

	public static void main(String[] args) {

		List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Practice_num47<Integer> myList = new Practice_num47<>(originalList);

        System.out.println("Original List: " + originalList);
        myList.removeRange(1, 3); // 부분리스트 [2, 3, 4]를 삭제
        System.out.println("Modified List: " + originalList); // 수정된 리스트 출력
		
	}

}
