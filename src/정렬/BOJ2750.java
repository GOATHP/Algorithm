package 정렬;

import java.util.*;
import java.io.*;

public class BOJ2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i < n; i++){
            for (int j=i+1; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
