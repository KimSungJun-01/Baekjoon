package step05.p10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        for(int i = 97; i <= 122; i++) {
            int count = 0;
            while(true) {
                if((int)s.charAt(count) == i) {
                    bw.write(String.valueOf(count) + " ");
                    break;
                }
                if(++count == s.length()) {
                    bw.write(String.valueOf(-1) + " ");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
