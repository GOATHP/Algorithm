package 입출력과사칙연산;//문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        첫째 줄에 A+B를 출력한다.
//
//        예제 입력 1
//        1 2
//        예제 출력 1
//        3


import java.io.*;
import java.util.*;

public class BOJ1000 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
    }
}


