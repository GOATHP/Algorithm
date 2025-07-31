//package 브루트포스;
//
//import java.util.*;
//import java.io.*;
//
//public class BOJ1018 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        String[] arr = new String[y];
//
//        for (int i = 0; i < x; i++) {
//            arr[i] = br.readLine();
//        }
//
//        while (true) {
//            int xStart = x - x;
//            int yStart = x - x;
//            String first = "";
//            for (int i = xStart; i < xStart+8; i++) {
//                for (int j = yStart; i < yStart+8; i++) {
//                        if(i==xStart && j ==yStart) {
//                            first = String.valueOf(arr[j].charAt(i));
//                        }
//                        if (j % 2 != 0) {
//                            if (i % 2 == 0) {
//                                if ( String.valueOf(arr[j].charAt(i) ) != first )){
//                                    cnt += 1;
//                                };
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//
//
//    }
//
