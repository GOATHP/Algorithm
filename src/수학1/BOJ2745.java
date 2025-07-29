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

    public static double toDemical(String n, int b) {

        char[] arr = n.toCharArray();

        for(int i=0; i<arr.length;i++) {
            if (arr[i] - 'A' >= 0) {
                System.out.println(arr[i] - 'A' + 10);

            }
            else if (arr[i] - '0' >= 0) {
                System.out.println(arr[i] - '0');
            }
        }

        return 0;
    }

}
