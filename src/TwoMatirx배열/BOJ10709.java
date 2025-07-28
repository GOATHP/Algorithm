package TwoMatirx배열;

import java.util.*;
import java.io.*;

public class BOJ10709 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<ArrayList<Character>> charArr = new ArrayList<>();

        for (int i=0; i<5; i++) {
            charArr.add(new ArrayList());
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int k = 0;
        int maxLen = 0; // 가장 긴 문자열 길이 저장

        // 5줄 입력
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            ArrayList<Character> row = new ArrayList<>();
            for (char c : line.toCharArray()) {
                row.add(c);
            }
            charArr.add(row);
            maxLen = Math.max(maxLen, row.size()); // 가장 긴 길이 저장
        }


        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < charArr.get(i).size()) {
                    System.out.print(charArr.get(i).get(j));
                }
            }
        }
    }
}
