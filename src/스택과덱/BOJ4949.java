package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = " ";
        while ( !(input = br.readLine()).equals(".")) {
            boolean flag = true;
            ArrayDeque<Character> stack = new ArrayDeque<>();
            char[] chs = input.toCharArray();
            for (char ch : chs) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    else if (stack.peek()=='(') {
                        stack.pop();
                    }
                    else if (stack.peek()=='[') {
                        flag = false;
                        break;
                    }
                }
                else if (ch == ']') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;}
                    if (stack.peek()=='[') {
                    stack.pop();
                    } else if (stack.peek()=='(') {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
