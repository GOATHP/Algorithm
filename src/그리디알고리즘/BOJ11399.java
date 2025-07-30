package 그리디알고리즘;

import java.util.*;
import java.io.*;

public class BOJ11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][1];
        int[] timearr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i ++) {


            int wait = Integer.parseInt(st.nextToken());
            timearr[i] = wait;
        }

        Arrays.sort(timearr);


        int sum = 0;
        for (int i = 0; i < n; i ++) {
            int temp = 0;
            for (int j = n-i-1; j >= 0; j--) {
            temp += timearr[j];
//                System.out.println(temp);
            }

            sum += temp;
        }
        System.out.println(sum);
    }
}
