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
            System.out.println( degre[i] + "/" + grade[i] + "/");
        }

        for (int i = 0; i < 20; i++) {

            if (grade[i] != "P") {
                sumDiv += degre[i];
            }
            if (grade[i] == "A+") {
                sumDegre += 4.5 * degre[i];
            } else if (grade[i] == "A0") {
                sumDegre += 4.0 * degre[i];
            } else if (grade[i] == "B+") {
                sumDegre += 3.5 * degre[i];
            } else if (grade[i] == "B0") {
                sumDegre += 3.0 * degre[i];
            } else if (grade[i] == "C+") {
                sumDegre += 2.5 * degre[i];
            } else if (grade[i] == "C0") {
                sumDegre += 2.0 * degre[i];
            }  else if (grade[i] == "D+") {
                sumDegre += 1.5 * degre[i];
            } else if (grade[i] == "F") {
                sumDegre += 0.0 * degre[i];
            }


        }
        System.out.println(sumDegre  + "/ " + sumDiv);

        System.out.println(sumDegre / sumDiv);
    }
}
