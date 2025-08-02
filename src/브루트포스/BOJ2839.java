package 브루트포스;

import java.util.*;
import java.io.*;

public class BOJ2839 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (n > 0) {

            if ( ( n % 5 ) % 3  == 0 ) {
                cnt += 1;
                n = n - 5;
            } else if ( n % 3 == 0 ){
                cnt += 1;
                n = n - 3;
            } else if ( ( n % 5 ) % 3  == 1 ) {
                n = n - 5;
                if (n % 3 == 0) {
                    cnt += 1;
                }
            } else {
                cnt = -1;
                break;
            }

        }
        if (cnt == 0) {cnt = -1;}
        System.out.println(cnt);
    }
}
