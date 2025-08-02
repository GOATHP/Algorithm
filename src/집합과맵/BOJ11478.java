package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ11478 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        HashSet<String> set = new HashSet<>();

        int window = 1;
        while (window <= text.length()) {
            for (int i=0; i<text.length(); i++) {
                if (i+window > text.length()) {break;}
//                System.out.println(text.substring(i, i+window));
                set.add(text.substring(i, i+window));
            }
            window++;
        }

        System.out.println(set.size());

    }
}
