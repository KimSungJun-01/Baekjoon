package step09.p9506;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> divisors;

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n == -1) {
                break;
            }

            int sum = 0;
            divisors = new ArrayList<>();
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }
            if(n == sum) {
                bw.write(n + " = ");
                for(int i = 0; i < divisors.size() - 1; i++) {
                    bw.write(divisors.get(i) + " + ");
                }
                bw.write(divisors.get(divisors.size() - 1) + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
