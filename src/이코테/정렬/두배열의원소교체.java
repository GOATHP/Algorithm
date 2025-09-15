package 이코테.정렬;

import java.util.*;
import java.io.*;

public class 두배열의원소교체 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        Integer[] arr2 = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i=0; i<n; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i =0 ; i < k; i++) {
            int temp = arr[i];
            arr[i] = arr2[i];
            arr2[i] = temp;
        }
        int cnt = 0;
        for (int i=0; i<n; i++) {
            cnt += arr[i];
        }

        System.out.println(cnt);
    }
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        Integer[] arrA = new Integer[n];
//        Integer[] arrB = new Integer[n];
//        for (int i=0; i<n; i ++) {
//            arrA[i] = Integer.parseInt(st1.nextToken());
//        }
//        for (int i=0; i<n; i ++) {
//            arrB[i] = Integer.parseInt(st2.nextToken());
//        }
//        Arrays.sort(arrA);
//        Arrays.sort(arrB, Collections.reverseOrder());
//        for (int i=0; i<m; i++) {
//            int temp;
//            temp = arrA[i];
//            arrA[i] = arrB[i];
//            arrB[i] = temp;
//
//        }
//        int sum=0;
//        for (int i=0; i<n; i++) {
//            System.out.println(arrA[i]);
//            sum += arrA[i];
//        }
//        System.out.println(sum);
//    }

}
