package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 곱하기혹은더하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int answer = 0;
        for(int i=1; i<st.length(); i++) {
            int preNum = st.charAt(i-1) - '0';
            int num = st.charAt(i) - '0';
            if (preNum == 0) {
                answer += num;
                System.out.println(num + "@@@@@@@@@" + preNum);
            } else {
                answer = answer * num;
                System.out.println(num + "//////////" + answer);
            }

        }
        System.out.println(answer);

    }


}
