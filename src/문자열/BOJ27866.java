package 문자열;

import java.util.*;
import java.io.*;

public class BOJ27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();

        int n = Integer.parseInt(br.readLine());
        System.out.println(text.charAt(n-1));

    }
}
