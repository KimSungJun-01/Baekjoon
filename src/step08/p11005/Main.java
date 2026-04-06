package step08.p11005;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        int quotient = n;
        while(quotient >= b) {
            list.add(quotient % b);
            quotient /= b;
        }
        list.add(quotient);
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++) {
            char c = Character.forDigit(list.get(i), b);
            c = Character.toUpperCase(c);
            bw.write(c);
        }

        bw.flush();
        bw.close();
    }
}
