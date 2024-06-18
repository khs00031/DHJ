package Collection;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
	public static void main(String[] args) {
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };

		// 1-(나)
		List<String> list = new LinkedList<String>(); // ArrayList -> LinkedList로 변경

		for (String color : colors)
			list.add(color); // adds color to end of list

		// 1-(나)
		String[] removeColors = { "RED", "WHITE", "BLUE" };
		List<String> removeList = new LinkedList<String>(); // ArrayList -> LinkedList로 변경
		for (String color : removeColors)
			removeList.add(color);

		/*
		 * 1-(나) 해설 요약 : 결과는 동일하게 나온다. 다만 기능에 따라 시간복잡도에서 차이를 가지기에 프로그램의 특성에 따라 적절히 도입이
		 * 필요하다.
		 * 
		 * 같은 List로써 도출해내는 결과는 같지만 구현방식(ArrayList, LinkedList)에 따라 특정 연산을 수행하는데 있어 각 방식이
		 * 갖는 특성에 따라 다를 수 있다. 예시 ArrayList는 get() 메소드에 유리하지만 remove() 메소드에는 불리하다. 반면
		 * LinkedList는 get() 메소드에는 비효율적이나 remove() 메소드에 효율적이다. 이렇듯 프로그램에서 자주 발생하는 연산에 따라
		 * 알맞은 구현방식의 도입이 필요하다.
		 * 
		 */

		// output list contents
		System.out.println("ArrayList: ");
//		for (int count = 0; count < list.size(); count++)
//			System.out.printf("%s ", list.get(count));
		// 1-(가) 시작
		Iterator<String> iterator = list.iterator();
		for (int count = 0; iterator.hasNext(); count++)
			System.out.printf("%s ", iterator.next());
		// 1-(가) 끝

		// remove from list the colors contained in removeList
		removeColors(list, removeList);

		// output list contents
		System.out.printf("%n%nArrayListafter calling removeColors:%n");
		for (String color : list)
			System.out.printf("%s ", color);
		
		// 2-(다) 시작
		LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(2);
        list2.add(4);
        System.out.println("\n\nOriginal List 2: " + list2);

        LinkedList<Integer> duplicates = removeDuplicatesGeneric(list2);
        System.out.println("List2 after duplicates removed: " + list2);
        System.out.println("Duplicate elements from List2: " + duplicates);
        // 2-(다) 끝
	}

	// remove colors specified in collection2 from collection1
	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
		// get iterator
		Iterator<String> iterator = collection1.iterator();
		// loop while collection has items
		while (iterator.hasNext()) {
//			if (collection2.contains(iterator.next()))
//				iterator.remove(); // remove current element
			
			// 1-(다).
			// iterator로 순회할거면 꼭 iterator로 remove해줘야함.
			// 기존코드처럼 collection1의 메소드로 remove 할 경우
			// iterator가 참조에 있어 혼선이 생겨 에러가 발생
			String s = iterator.next();
			if (collection2.contains(s))
				iterator.remove();		// 수정된 부분

		}
	}
	
	// 2-(다)
	private static <E> LinkedList<E> removeDuplicatesGeneric(LinkedList<E> list) {
        LinkedList<E> duplicateElements = new LinkedList<>();

        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            // 현재 요소 이후에 같은 요소가 있는지 검사
            if (list.indexOf(element) != list.lastIndexOf(element)) {
                // 중복되는 요소를 duplicateElements에 추가
                if (!duplicateElements.contains(element)) {
                    duplicateElements.add(element);
                }
                // 원본 리스트에서는 해당 요소를 제거
                iterator.remove();
            }
        }

        return duplicateElements;
    }
} // end class CollectionTest