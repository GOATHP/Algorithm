package 심화1;

import java.util.*;
import java.io.*;

public class BOJ2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] textArr = {"c=" , "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String ansText = br.readLine();

        int cnt = 0;

        int ans = ansText.length();

        for (String text : textArr) {
            if (ansText.contains(text)) {

                System.out.println(text);
                ans -= text.length();

                System.out.println(text);
                ans += 1;
            }
        }

        System.out.println(ans);
    }

}
