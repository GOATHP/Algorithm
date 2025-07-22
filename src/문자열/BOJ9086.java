package 문자열;

import java.util.*;
import java.io.*;

public class BOJ9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            System.out.println(text.charAt(0) + "" + text.charAt(text.length()-1));
        }

    }

}
