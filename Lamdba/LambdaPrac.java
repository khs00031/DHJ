import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import LambdaPrac.Person;

public class LambdaPrac {

	public static void main(String[] args) {
		final int N = 5;
		Person[] persons = new Person[N];
		for (int i = 1; i <= N; i++)
			persons[i - 1] = new Person(i, 19 + i);

		// A-1. 이 부분에 Comparator를 이용해 persons를 sort하시오.
		Arrays.sort(persons, personComparator); // Nested Class: Comparator를 구현한 nested 클래스입니다.

		// B. 이 부분에 람다식을 통해 persons를 sort하시오.

		// 결과출력
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

	}

	// A-2. Comparator 작성부분
	// Nested 클래스 (Static Nested Class)
	static Comparator<Person> personComparator = new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			System.out.println(o1 + " 과 " + o2 + " 를 비교");
			return Integer.compare(o2.age, o1.age);
			// 첫번째 파라미터가 앞에 있으면 내림차순
		}
	};

}

class Person {
	int code, age;

	public Person(int code, int age) {
		super();
		this.code = code;
		this.age = age;
	}

	@Override
	public String toString() {
		return "code=" + code + ", age=" + age;
	}
}
