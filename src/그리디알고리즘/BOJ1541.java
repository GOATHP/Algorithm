package 그리디알고리즘;

import java.util.*;
import java.io.*;

public class BOJ1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] expres = br.readLine().toCharArray();
        ArrayList<Integer> list = new ArrayList<>();

        String numString = "";
        int num = 0;
        for (char expre : expres) {
            if (expre == '-' || expre == '+') {
                num = Integer.parseInt(numString);
                list.add(num);
                numString = "";
                num = 0;
            } else {

            }
        }

    }
}
