package 심화1;

import java.util.*;
import java.io.*;

public class BOJ1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        boolean[] alphabet = new boolean[26];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean[] alphabet = new boolean[26];
            boolean answer = true;
            char[] cha = br.readLine().toCharArray();
            for (int k = 1; k < cha.length; k++) {

//                if (alphabet[cha[k] - 'a'] == false) {
//                    alphabet[cha[k] - 'a'] = true;
//                }
//                System.out.println(cha[k-1] + "/" + cha[k] + "/" +alphabet[cha[k]-'a']);
                alphabet[cha[k-1] - 'a'] = true;

                if ((cha[k - 1] != cha[k] && alphabet[cha[k] - 'a'] == true)) {
                    answer = false;
                }
//                } else {
//                    cnt += 1;
//                }
//                if (cha[k - 1] != cha[k] && alphabet[cha[k] - 'a'] == false) {
                alphabet[cha[k] - 'a'] = true;
//                    }
//                }
            }
            if (answer == true) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
