package step08.p2720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int quarter = 0, dime = 0, nickel = 0, penny = 0;
            int c = Integer.parseInt(br.readLine());
            while(c >= 25) {
                quarter = c / 25;
                c %= 25;
            }
            while(c >= 10) {
                dime = c / 10;
                c %= 10;
            }
            while(c >= 5) {
                nickel = c / 5;
                c %= 5;
            }
            penny = c;

            bw.write(String.valueOf(quarter + " " + dime + " " + nickel + " " + penny + "\n"));
        }

        bw.flush();
        bw.close();
    }
}
