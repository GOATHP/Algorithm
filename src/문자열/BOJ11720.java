package 문자열;

import java.util.*;
import java.io.*;

public class BOJ11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        String str = br.readLine();
        char[] nums = str.toCharArray();
        int[] numsInt = new int[n];


        for (int i=0; i<n; i++) {

            sum += (int) nums[i];

        }

        System.out.println(sum);

    }

}
