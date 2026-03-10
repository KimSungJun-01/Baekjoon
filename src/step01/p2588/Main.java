package step01.p2588;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number1 = Integer.parseInt(br.readLine());
        String line = br.readLine();

        int number2[] = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            number2[i] = line.charAt(i) - '0';
        }

        int number3 = number1 * number2[2];
        int number4 = number1 * number2[1];
        int number5 = number1 * number2[0];
        int number6 = number1 * Integer.parseInt(line);

        bw.write(String.valueOf(number3 + "\n" + number4 + "\n" + number5 + "\n" + number6));
        bw.flush();
        bw.close();
    }
}
