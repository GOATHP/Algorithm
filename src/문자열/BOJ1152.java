package 문자열;

import java.util.*;
import java.io.*;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String phrase = br.readLine();

        String trimPhrase = phrase.trim();

        char[] chs = trimPhrase.toCharArray();

        int cnt = 1;

        for (char ch : chs) {
            if (ch == ' ') {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}
