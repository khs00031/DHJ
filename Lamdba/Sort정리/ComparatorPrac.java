import java.util.Arrays;
import java.util.Comparator;

// Comparator를 활용하면 main에서 comparator만 불러와서 쓰면 된다.
// 장점 : 여러 정렬기준 생성가능
public class ComparatorPrac {

	public static void main(String[] args) {
		int N = 5;
		Person persons[] = new Person[N];
		persons[0] = new Person(1, 30, 46);
		persons[1] = new Person(2, 12, 98);
		persons[2] = new Person(3, 44, 67);
		persons[3] = new Person(4, 32, 78);
		persons[4] = new Person(5, 26, 50);

		System.out.println("나이 순으로 정렬 후 출력합니다.");
		Arrays.sort(persons, personAgeComparator); // comparator의 정렬기준으로 정렬
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		System.out.println("\n코드 순으로 정렬 후 출력합니다");
		Arrays.sort(persons, personCodeComparator); // comparator의 정렬기준으로 정렬
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		System.out.println("\n무게 순으로 정렬 후 출력합니다");
		Arrays.sort(persons, personWeightComparator); // comparator의 정렬기준으로 정렬
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);
	}

	// Nested 클래스 (Static Nested Class)
	static Comparator<Person> personAgeComparator = new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			return Integer.compare(o1.age, o2.age);
			// 첫번째 파라미터가 앞에 있으면 오름차순
		}
	};

	static Comparator<Person> personCodeComparator = new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			return Integer.compare(o1.code, o2.code);
			// 첫번째 파라미터가 앞에 있으면 오름차순
		}
	};

	static Comparator<Person> personWeightComparator = new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			return Integer.compare(o1.weight, o2.weight);
			// 첫번째 파라미터가 앞에 있으면 오름차순
		}
	};

}

class Person {
	int code, age, weight;

	public Person(int code, int age, int weight) {
		this.code = code;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "code=" + code + ", age=" + age + ", weight=" + weight;
	}

}