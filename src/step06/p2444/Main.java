package step06.p2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 상층부
        for(int i = 1; i < n; i++) {
            for(int j = (n - i); j > 0; j--) {
                bw.write(" ");
            }
            for(int j = 1; j <= ((2 * i) - 1); j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        // 중간
        for(int i = 0; i < ((2 * n) - 1); i++) {
            bw.write("*");
        }
        bw.write("\n");

        // 하층부
        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= i; j++) {
                bw.write(" ");
            }
            for(int j = ((2 * n) - 1 - (2 * i)); j > 0; j --) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
