package 수학1;

import java.util.*;
import java.io.*;

public class BOJ2720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            sb.append(m/25 + " ");
            m = m % 25;
            sb.append(m/10 + " ");
            m = m % 10;
            sb.append(m/5 + " ");
            m = m % 5;
            sb.append(m/1 + " ");
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }

}
