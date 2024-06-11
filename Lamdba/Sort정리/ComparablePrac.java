import java.util.Arrays;

// Comparable을 활용해 class의 정렬기준 지정.
// 장점 : class 자체적으로 대소비교 기준이 정해짐으로 별도의 comparator가 필요없음.
// 한계 : 한가지 정렬기준에 대해서만 main함수에서 활용할 수 있다.
public class ComparablePrac {

	public static void main(String[] args) {
		int N = 5;
		Person persons[] = new Person[N];
		persons[0] = new Person(1, 30, 46);
		persons[1] = new Person(2, 12, 98);
		persons[2] = new Person(3, 44, 67);
		persons[3] = new Person(4, 32, 78);
		persons[4] = new Person(5, 26, 50);

		// 나이순 출력
		System.out.println("나이 순으로 정렬 후 출력합니다.");
		Arrays.sort(persons); // 이미 Comparable을 통해 정렬기준이 정해져 있음 -> 별도의 comparator 불필요
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		// 한계. 무게순으로 출력하고 싶으면 Person클래스를 수정해야함.

	}
}

//추가된 부분1. Comparable interface implement
class Person implements Comparable<Person> {
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

	// 추가된 부분2. 정렬 기준 지정
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}

}