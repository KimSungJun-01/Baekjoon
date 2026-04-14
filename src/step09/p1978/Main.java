package step09.p1978;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            if(number == 1) {
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j < number; j++) {
                if(number % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
