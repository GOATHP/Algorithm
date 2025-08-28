package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int num = 0;

        while (n != 1) {
            num = isPrime(n);
            sb.append(num+"\n");
            n = n / num;
        }
        System.out.println(sb.toString());

    }
    public static int isPrime(int num) {


        System.out.println(num);
        if (num % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i < num; i++) {
            System.out.println(num);
            if (num % i == 0) {
                System.out.println(i);
                return i;
            }
        }

        return 0;
    }
}
