package 정렬;

import java.util.*;
import java.io.*;

public class BOJ1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i=0;i<n;i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return Integer.compare ( (int) a.toCharArray()[0] - 'a', (int) b.toCharArray()[0] - 'a');
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }


}
