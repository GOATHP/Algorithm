package 문자열;

import java.util.*;
import java.io.*;

public class BOJ2675 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            String text = String.valueOf(st.nextToken());
            char[] chs = text.toCharArray();

            for (char ch : chs) {
                for (int i = 0; i<n; i++) {
                    sb.append(ch);
                }
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
    }
}
