package step09.p2581;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for(int i = m; i <= n; i++) {
            if(isPrime(i)) {
                sum += i;
                list.add(i);
            }
        }

        if(list.size() == 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum + "\n" + list.get(0)));
        }

        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n < 2) {
            isPrime = false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
