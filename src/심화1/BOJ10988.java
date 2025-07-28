package 심화1;

import java.util.*;
import java.io.*;

public class BOJ10988 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] text = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < text.length / 2; i++) {
            if (text[i] == text[text.length - i - 1]) {
                cnt += 1;
            }
            else {
                cnt += 0;
                break;

            }
        }
        if (cnt == (text.length / 2) ){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
