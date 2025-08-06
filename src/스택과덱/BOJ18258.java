package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        queue q = new queue();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {

            String order = br.readLine();

            if (order.contains(" ")) {
                StringTokenizer st = new StringTokenizer(order);
                st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                q.push(x);
            }
            else {
                if (order.equals("pop")) {

                    sb.append(q.pop()+"\n");
                } else if (order.equals("size")) {
                    sb.append(q.size()+"\n");
                } else if (order.equals("empty")) {
                    sb.append(q.isEmpty()+"\n");
                } else if (order.equals("front")) {
                    sb.append(q.peek()+"\n");
                } else if (order.equals("back")) {
                    sb.append(q.peekLast()+"\n");
                }
            }
        }
        System.out.println(sb);

    }



    public static class queue {

        LinkedList<Integer> list = new LinkedList<>();

        public void push(int x) {
            list.add(x);
        }

        public int pop() {
            if (list.isEmpty()) {
            return -1;
            }
            return list.poll();
        }

        public int size() {
            return list.size();
        }

        public int isEmpty() {
            if (list.isEmpty()){
                return 1;
            } else {
                return 0;
            }
        }
        public int peek() {

            if (list.isEmpty()) {

                return -1;
            }
            return list.peek();
        }
        public int peekLast() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.peekLast();
        }

    }

}
