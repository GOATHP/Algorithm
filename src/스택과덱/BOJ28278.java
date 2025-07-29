package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack stack = new Stack();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String order = br.readLine();


            if (order.length() == 1){
                int intOrder = Integer.parseInt(order);
                if (intOrder == 2) {
                    stack.pop(arr);
                } else if (intOrder == 3) {
                    stack.print(arr);
                } else if (intOrder == 4) {
                    stack.isEmpty(arr);
                } else if (intOrder == 5) {
                    stack.peek(arr);
                }
            } else {
                StringTokenizer st = new StringTokenizer(order);
                Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                stack.push(arr, m);
            }
        }
    }


    public static int Stack(ArrayList<Integer> arr, int n) {

        return 1;
    }

    public static class Stack {
        public void push(ArrayList<Integer> arr, int m) {
            arr.add(m);
        }
        public void pop(ArrayList<Integer> arr) {

            if (arr.isEmpty()) {
                System.out.println(-1);
            } else {
                int last = arr.get(arr.size() - 1);
                arr.remove(arr.size() - 1);
                System.out.println(last);
            }
        }

        public void print(ArrayList<Integer> arr) {
            System.out.println(arr.size());
        }

        public void isEmpty(ArrayList<Integer> arr) {
            if (arr.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        public void peek(ArrayList<Integer> arr) {
            if (arr.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arr.get(arr.size()-1));
            }
        }
    }
}

