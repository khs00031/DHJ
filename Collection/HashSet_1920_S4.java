import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class HashSet_1920_S4 {
	static int N, M;

	public static void main(String[] args) throws IOException {
		int[] arr1, arr2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 입력받기
		N = Integer.parseInt(br.readLine());
		arr1 = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++)
			arr1[i] = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		arr2 = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++)
			arr2[i] = Integer.parseInt(st.nextToken());

//		printResult1(arr1, arr2);
		printResult2(arr1, arr2);
	}

	// HashSet을 사용하지 않는 경우
	static void printResult1(int[] arr1, int[] arr2) {
		StringBuilder sb = new StringBuilder(); // 결과 출력용

		// arr2 원소하나하나를 arr1 전부돌면서 있는지 찾아보기
		p1: for (int i2 = 0; i2 < M; i2++)
			for (int i1 = 0; i1 < N; i1++)
				if (arr1[i1] == arr2[i2]) {
					sb.append(1).append("\n");
					continue p1;
				} else if (i1 == N - 1)
					sb.append(0).append("\n");

		System.out.println(sb);
	}

	// HashSet을 사용하는 경우
	static void printResult2(int[] arr1, int[] arr2) {
		StringBuilder sb = new StringBuilder(); // 결과 출력용

		// HashSet에 arr1 내용 넣고 arr2 원소 하나하나를 set에 존재하는지 보기
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) // set에 arr1원소 다 넣기
			set.add(arr1[i]);
		for (int i = 0; i < M; i++)	// arr2 순회
			if (set.contains(arr2[i])) // set에 있으면
				sb.append(1).append("\n");
			else // set에 없으면
				sb.append(0).append("\n");

		System.out.println(sb);
	}

}
