package 이코테.정렬;

import java.util.*;
import java.io.*;

public class 위에서아래로 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
