package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ9506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        while (input != -1) {
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }
            if (input == sum) {
                System.out.print(sum + " = ");
                for (int i = 0; i < arr.size(); i++) {
                    if (i == 0) {
                        System.out.print(arr.get(i));
                    } else {
                        System.out.print(" + " + arr.get(i));
                    }
                }
            } else {
                System.out.print(input + " is NOT perfect.");
            }
            System.out.println();
            input = Integer.parseInt(br.readLine());

        }
    }
}
