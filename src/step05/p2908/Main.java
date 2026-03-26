package step05.p2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(st.nextToken());
        String reverseA = sb.reverse().toString();

        sb = new StringBuffer(st.nextToken());
        String reverseB = sb.reverse().toString();

        int a = Integer.parseInt(reverseA);
        int b = Integer.parseInt(reverseB);

        if(a > b) {
            bw.write(String.valueOf(a));
        } else {
            bw.write(String.valueOf(b));
        }

        bw.flush();
        bw.close();
    }
}
