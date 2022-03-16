package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<Integer>();

		int n = Integer.parseInt(br.readLine());
		int back = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch (s) {
				case "push":
					int num = Integer.parseInt(st.nextToken());
					que.add(num);
					back = num;
					break;
				case "pop":
					if(que.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(que.poll() + "\n");
					}
					break;
				case "size":
					sb.append(que.size() +"\n");
					break;
				case "empty":
					if(que.isEmpty()) {
						sb.append("1\n");
					}else {
						sb.append("0\n");
					}
					break;
				case "front":
					if(que.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(que.peek()+"\n");
					}
					break;
				case "back":
					if(que.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(back+"\n");
					}
					break;

			}
			
		}
		System.out.println(sb);

	}
}