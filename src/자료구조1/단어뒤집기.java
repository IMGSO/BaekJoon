package 자료구조1;

import java.util.Scanner;
import java.util.Stack;

public class 단어뒤집기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] arr = new String[T];
        
        for(int i=0;i<T;i++) {
        	String string = sc.nextLine()+"\n";
        	int left = 0;
        	int right = 0;
        	for(int j=0;j<string.length();j++) {
        		if(string.charAt(j)=='(') {
        			left++;
        		}else if(string.charAt(j)==')') {
        			right++;
        		}
        	}
        	if(left == right) {
        		System.out.println("YES");
        	}else {
        		System.out.println("NO");
        	}
        }
    }
}