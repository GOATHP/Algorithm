package 수학1;

import java.util.*;
import java.io.*;

public class BOJ2745 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();

        int b = Integer.parseInt(st.nextToken());

        toDemical(n, b);
    }

    public static void toDemical(String n, int b) {
        long answer = 1;

        for (int i = n.length() - 1; i>=0; i--) {
            if ( (n.charAt(i) - '0') < 10 ) {
                answer *= Integer.parseInt(n);
            } else {
                answer *= ( n.charAt(i) - 'A' + 11);
            }
        }
        System.out.println(answer);
    }
}
