package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
//        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i=0; i<n; i++) {
            ArrayDeque<String> stack = new ArrayDeque<>();

            char[] str = br.readLine().toCharArray();

            for (int j=0; j<str.length; j++) {
                if (str[j] == '(') {
                    stack.push(String.valueOf(str[j]));
                } else if (str[j] == ')') {
                    if(stack.isEmpty()) {
                        System.out.println("NO");
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }

    }
}
