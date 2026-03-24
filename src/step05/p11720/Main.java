package step05.p11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String numbers = br.readLine();

        int sum = 0;
        for(int i = 0; i < numbers.length(); i++) {
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
