package BOJ;

import java.util.Scanner;

public class boj_2675 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for (int i = 0; i < T; i++) {

			int a = in.nextInt();
			String A = in.next();

			for (int j = 0; j < A.length(); j++) {
				for (int k = 0; k < a; k++) {
					System.out.print(A.charAt(j));
				}
			}

			System.out.println();
		}

	}

}
