package 이코테.그리디;

import java.util.*;
import java.io.*;


public class 큰수의법칙 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st2.nextToken());
        int[] arr = new int[n];
        int m = Integer.parseInt(st2.nextToken());
        int k = Integer.parseInt(st2.nextToken());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int nm =  m % k;
        System.out.println( ( m - nm ) * arr[n-1]  + ( nm * arr[n-2] ));


    }

}
