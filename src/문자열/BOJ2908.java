package 문자열;

import java.util.*;
import java.io.*;

public class BOJ2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken();

        String[] firstStr = first.split("");

        int firstNum = Integer.parseInt(firstStr[2] + firstStr[1] + firstStr[0]);

        String second = st.nextToken();

        String[] secondStr = second.split("");

        int secondNum = Integer.parseInt(secondStr[2] + secondStr[1] + secondStr[0]);

        System.out.println(Math.max(firstNum, secondNum));
    }

}
