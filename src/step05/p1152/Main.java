package step05.p1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String line = input.trim();

        String words[] = line.split("\\s");

        if(words[0].isEmpty()) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(words.length));
        }

        bw.flush();
        bw.close();
    }
}
