package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = " ";


        while (!input.isEmpty()) {
            boolean flag = true;
            ArrayDeque<Character> stack = new ArrayDeque<>();
            ArrayDeque<Character> stack2 = new ArrayDeque<>();
            input = br.readLine();
            if (input == ".") {
                return;
            }
            char[] chs = input.toCharArray();
            for (char ch : chs) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == '[') {
                    stack2.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else if (!stack2.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == ']') {
                    if (stack2.isEmpty()) {
                        flag = false;
                        break;
                    } else if (!stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack2.pop();
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
