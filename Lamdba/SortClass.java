import java.util.Arrays;

public class SortClass {

	public static void main(String[] args) {
		int N = 5;
		int arr[] = { 1, 4, 6, 2, 9 };
		Person persons[] = new Person[N];
		persons[0] = new Person(1, 30);
		persons[1] = new Person(2, 12);
		persons[2] = new Person(3, 44);
		persons[3] = new Person(4, 32);
		persons[4] = new Person(5, 26);

//		Arrays.sort(arr);
//		for (int i = 0; i < N; i++)
//			System.out.print(arr[i] + " ");
//		System.out.println();
		

		Arrays.sort(persons);	// persons배열의 정렬은 여기서 일어남
		for(int i=0;i<N;i++)
			System.out.println(persons[i]);
	}

}

// 추가된 부분1. Comparable interface implement
class Person implements Comparable<Person>{
	int code, age;

	public Person(int code, int age) {
		this.code = code;
		this.age = age;
	}

	@Override
	public String toString() {
		return "code=" + code + ", age=" + age;
	}

	// 추가된 부분2. 정렬 기준 지정
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}

}
