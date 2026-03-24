package step04.p3052;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> result = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            result.add(input % 42);
        }

        bw.write(String.valueOf(result.size()));
        bw.flush();
        bw.close();
    }
}
