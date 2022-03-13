package 자료구조1;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println(solve(sc.next()));
		}

	}

	public static String solve(String s) {
		Stack stack = new Stack<>();
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);

			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty()) {
					return "NO";
				} else {
					stack.pop();
				}

			}

		}
		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
