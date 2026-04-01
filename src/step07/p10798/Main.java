package step07.p10798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char matrix[][] = new char[5][15];

        for(int i = 0; i < 5; i++) {
            String line = br.readLine();

            for(int j = 0; j < line.length(); j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(matrix[j][i] != 0) {
                    bw.write(matrix[j][i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
