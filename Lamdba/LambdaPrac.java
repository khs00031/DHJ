import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LambdaPrac {

	public static void main(String[] args) {
		final int N = 5;
		Person[] persons = new Person[N];
		for (int i = 1; i <= N; i++)
			persons[i - 1] = new Person(i, 19 + i);

		// A-1. 이 부분에 Comparator를 이용해 persons를 sort하시오.
		
		// B. 이 부분에 람다식을 통해 persons를 sort하시오.
		
		
		// 결과출력
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

	}
	
	// A-2. Comparator 작성부분


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
