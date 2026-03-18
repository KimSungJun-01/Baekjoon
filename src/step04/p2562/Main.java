package step04.p2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int list[] = new int[10];

        for(int i = 1; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int max = list[1];
        int count = 1;

        for(int i = 2; i < list.length; i++) {
            if(list[i] > max) {
                max = list[i];
                count = i;
            }
        }

        bw.write(String.valueOf(max + "\n" + count));
        bw.flush();
        bw.close();
    }
}
