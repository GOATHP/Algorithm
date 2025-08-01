package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ11478 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        HashSet<String> set = new HashSet<>();

        set.add(text);

        for(int i=0;i<text.length()-1;i++) {
            for(int j=i+1;j<text.length();j++) {
                System.out.println("i ====>" +i);
                System.out.println("j ====>" +j);
//                System.out.println("String I" + text.charAt(i));
                System.out.print( String.valueOf(text.charAt(i))  + String.valueOf(text.charAt(j)) );
            }
        }
//
//        for (int i = 0; i<set.toArray().length;i++) {
//            System.out.println(set);
//        }

    }
}
