package 정렬;

import java.util.*;
import java.io.*;

public class BOJ2587 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i=0; i<5; i++) {
            sum += arr[i];
        }

        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }

}
