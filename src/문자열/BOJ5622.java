package 문자열;

import java.util.*;
import java.io.*;

public class BOJ5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         String[] dial = br.readLine().split("");


         String[] alpIndex = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

         int cnt = 0;

         for (int i=0; i < dial.length; i++) {
             for (int j = 0; j < alpIndex.length; j++) {
                if ( dial[i].contains(alpIndex[j]) ) {

                    if (j <= 2) {          // A B C
                        cnt += 3;
                    } else if (j <= 5) {   // D E F
                        cnt += 4;
                    } else if (j <= 8) {   // G H I
                        cnt += 5;
                    } else if (j <= 11) {  // J K L
                        cnt += 6;
                    } else if (j <= 14) {  // M N O
                        cnt += 7;
                    } else if (j <= 17) {  // P Q R
                        cnt += 8;
                    } else if (j == 18) {  // S
                        cnt += 8;
                    } else if (j <= 21) {  // T U V
                        cnt += 9;
                    } else {               // W X Y Z
                        cnt += 10;
                    }

                }
             }
         }
         System.out.println(cnt);
    }
}
