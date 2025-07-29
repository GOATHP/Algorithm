package 조합론;

import java.util.*;
import java.io.*;

public class BOJ24723 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int power = Integer.parseInt(br.readLine());

        int base = 2;

        int result =1 ;

        for (int i = 0; i<power; i++){
            result *= 2;
        }

        System.out.println(result);
    }


}
