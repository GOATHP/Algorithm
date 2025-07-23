package 문자열;

import java.util.*;
import java.io.*;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chs = text.toCharArray();

        int[] alp = new int[26];

        for (int i=0; i<alp.length; i++) {
            alp[i] = -1;
        }

        for (int i=0; i<chs.length; i++) {
            if (alp[chs[i] - 'a'] == -1) {
                alp[chs[i] - 'a'] = i;
            }

        }
        for (int i=0; i<alp.length; i++) {
            if (i == alp.length-1) {
                sb.append(alp[i]);
            } else {
                sb.append((alp[i] + " ").trim());
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}