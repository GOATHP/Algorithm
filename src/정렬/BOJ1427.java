package 정렬;

import java.util.*;
import java.io.*;

public class BOJ1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        Integer[] arr = new Integer[charArr.length];

        for (int i=0;i<charArr.length;i++) {
            arr[i] = charArr[i] - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0;i<charArr.length;i++) {
            System.out.print(arr[i]);
        }

    }

}
