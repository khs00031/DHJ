import java.util.Arrays;

// Lambda식을 활용해 정렬기준을 바로바로 넣어준다.
public class LambdaPrac {

	public static void main(String[] args) {
		int N = 5;
		Person persons[] = new Person[N];
		persons[0] = new Person(1, 30, 46);
		persons[1] = new Person(2, 12, 98);
		persons[2] = new Person(3, 44, 67);
		persons[3] = new Person(4, 32, 78);
		persons[4] = new Person(5, 26, 50);

		System.out.println("나이 순으로 정렬 후 출력합니다.");
		Arrays.sort(persons, (o1, o2) -> Integer.compare(o1.age, o2.age)); // comparator를 Lambda식으로 바로 생성
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		System.out.println("\n코드 순으로 정렬 후 출력합니다");
		Arrays.sort(persons, (o1, o2) -> Integer.compare(o1.code, o2.code)); // comparator를 Lambda식으로 바로 생성
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		System.out.println("\n무게 순으로 정렬 후 출력합니다");
		Arrays.sort(persons, (o1, o2) -> Integer.compare(o1.weight, o2.weight)); // comparator를 Lambda식으로 바로 생성
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);
	}

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