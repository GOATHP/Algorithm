package 반복문;

import java.util.*;
import java.io.*;

public class BOJ25304 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int recPrice = Integer.parseInt(br.readLine());

        int numOfStuff = Integer.parseInt(br.readLine());

        int totalPrice = 0;

        for (int i = 0; i < numOfStuff; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            totalPrice += price+num;
        }

        if (totalPrice == recPrice) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
