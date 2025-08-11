package 심화1;

import java.util.*;
import java.io.*;

public class BOJ25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] degre = new double[20];
        String[] grade = new String[20];
        double sumDegre = 0;
        double sumDiv = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            degre[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();
        }

        for (int i = 0; i < 20; i++) {

            if (grade[i].equals("P")) continue;

                sumDiv += degre[i];
            if (grade[i].equals( "A+") ) {
                sumDegre += 4.5 * degre[i];
            } else if (grade[i].equals("A0")) {
                sumDegre += 4.0 * degre[i];
            } else if (grade[i].equals("B+")) {
                sumDegre += 3.5 * degre[i];
            } else if (grade[i].equals("B0")) {
                sumDegre += 3.0 * degre[i];
            } else if (grade[i].equals( "C+")) {
                sumDegre += 2.5 * degre[i];
            } else if (grade[i].equals("C0")) {
                sumDegre += 2.0 * degre[i];
            }  else if (grade[i].equals("D+")) {
                sumDegre += 1.5 * degre[i];
            } else if (grade[i].equals("D0")) {
                sumDegre += 1.0 * degre[i];
            } else if (grade[i].equals("F")) {
                sumDegre += 0.0 * degre[i];
            }


        }

        System.out.printf("%.6f", sumDegre / sumDiv);
    }
}
