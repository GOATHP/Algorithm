package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i=0;i<n;i++){
            int value = Integer.parseInt(br.readLine());

            if ( value == 0 ) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }

        int cnt = 0;
        while (stack.size() != 0) {
            cnt += stack.pop();
        }

        System.out.println(cnt);

    }
}
