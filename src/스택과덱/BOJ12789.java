package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int[] arr = new int[n];
        int[] orderedArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            orderedArr[i] = i+1;
        }
        int target = 1;

        while (target == n) {

            for (int i=0; i<n; i++) {
                if ( arr[i] != target ){
                    dq.push(arr[i]);
                } 
            }
        }
    }
}
