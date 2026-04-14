package step09.p2501;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divisors.add(i);
            }
        }

        if(divisors.size() < k) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(divisors.get(k - 1)));
        }

        bw.flush();
        bw.close();
    }
}
