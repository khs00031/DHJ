package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		// add elements in colors array to list
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN", "RED", "CYAN", "RED", "BLUE" };
		LinkedList<String> list = new LinkedList<String>();
		makeList(list, colors); // 2-가

		// output list contents
		System.out.printf("%n%nOriginal colors:%n");
		printList(list);

		// ***
		// remove duplicates and get duplicates
		List<String> list2 = removeDuplicates(list); // 2-나

		// output list contents
		System.out.printf("%n%nDuplicate-removed colors:%n");
		printList(list);

		// output list contents
		System.out.printf("%n%nDuplicated colors:%n");
		printList(list2);
	}

	private static void printList(List<String> list) {
		for (String color : list)
			System.out.printf("%s ", color);
	}

	private static void makeList(LinkedList<String> list, String[] colors) { // 2-가
		ListIterator<String> iterator = list.listIterator();

		for (String color : colors)
			iterator.add(color); // ListIterator를 사용하여 요소 추가

	}

	private static LinkedList<String> removeDuplicates(LinkedList<String> list) { // 2-나
		LinkedList<String> duplicateElements = new LinkedList<>(); // 중복 원소 저장을 위한 리스트

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
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
	

}