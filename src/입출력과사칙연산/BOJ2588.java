package 입출력과사칙연산;

import java.io.*;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());

        int one = second % 10;
        int ten = (second / 10) % 10;
        int hundred = second / 100;

        System.out.println(first * one);      // (3)
        System.out.println(first * ten);      // (4)
        System.out.println(first * hundred);  // (5)
        System.out.println(first * second);   // (6)
    }
}