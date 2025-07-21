package 조건문;

import java.util.*;
import java.io.*;

public class BOJ2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if ( ( m - 45 < 0 ) & ( h != 0 ) ) {
            System.out.println( h - 1 + " " + (m + 60 - 45) );
        }




    }


}
