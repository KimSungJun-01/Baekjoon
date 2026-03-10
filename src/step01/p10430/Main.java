package step01.p10430;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result1 = (a + b) % c;
        int result2 = ((a % c) + (b % c)) % c;
        int result3 = (a * b) % c;
        int result4 = ((a % c) * (b % c)) % c;

        bw.write(String.valueOf(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4));
        bw.flush();
        bw.close();
    }
}
