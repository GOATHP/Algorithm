package 수학1;

import java.util.*;
import java.io.*;

public class BOJ11005 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(reverseDem(n, b));

    }


    public static String reverseDem(Long n, int b) {

        Long remain = n;
        int base = b;
        String result = "";
        StringBuilder sb = new StringBuilder();
        while (remain % base != 0) {
            sb.append( (char) (remain % base + 55) );
            remain = remain / base;
        }
        return sb.toString();
    }

}
