package 심화1;

import java.util.*;
import java.io.*;

public class BOJ1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toLowerCase().toCharArray();
        int[] cntArr = new int[text.length];
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int cnt2 = 0;
        int index = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                if (text[i] == text[j]) {
                    cnt += 1;
                }
                cntArr[i] = cnt;
                cnt = 0;
            }
        }
        for (int i = 0; i < text.length; i++) {
            if (cntArr[i] > max) {
                max = cntArr[i];
            } else if (cntArr[i] == max) {
                cnt2 += 1;
            }
        }
        if (cnt2 == 1) {
            System.out.println(String.valueOf(text[index]).toUpperCase());
        } else {
            System.out.println("?");
        }

    }
}
