package step04.p5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int student[] = new int[31];

        for (int i = 0; i < 28; i++) {
            int number = Integer.parseInt(br.readLine());
            student[number] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (student[i] == 0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
