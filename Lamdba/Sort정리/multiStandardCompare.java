import java.util.Arrays;

// 정렬에서 고려해야하는 변수가 여러개인 경우 처리방법
// Comparable, Comparator 모두 적용가능하다.
public class multiStandardCompare {

	public static void main(String[] args) {
		int N = 5;
		Person persons[] = new Person[N];
		persons[0] = new Person(1, 30, 46);
		persons[1] = new Person(2, 12, 98);
		persons[2] = new Person(3, 44, 46);
		persons[3] = new Person(4, 30, 33);
		persons[4] = new Person(5, 12, 50);

		// 나이, 무게, 코드 순 출력
		// 즉, 나이를 먼저 비교하고 나이가 같으면 몸무게 비교, 무게도 같으면 코드비교
		System.out.println("나이, 무게, 코드 순으로 정렬 후 출력합니다.");
		Arrays.sort(persons); // 이미 Comparable을 통해 정렬기준이 정해져 있음 -> 별도의 comparator 불필요
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		// 한계. 무게순으로 출력하고 싶으면 Person클래스를 수정해야함.

	}
}

// 추가된 부분1. Comparable interface implement
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
		// 1순위 나이 비교
		if (this.age != o.age)
			return Integer.compare(this.age, o.age);
		
		// 2순위 무게 비교
		if (this.weight != o.weight)
			return Integer.compare(this.weight, o.weight);
		
		// 3순위 코드 비교
		else
			return Integer.compare(this.code, o.code);
	}

}