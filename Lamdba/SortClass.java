import java.util.Arrays;

public class SortClass {

	public static void main(String[] args) {
		int N =5;
		int arr[] = {1,4,6,2,9};
//		Person persons[] = new Person[N];
		
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}

//class Person {
//	int code, age;
//
//	public Person(int code, int age) {
//		this.code = code;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "code=" + code + ", age=" + age;
//	}
//
//}
