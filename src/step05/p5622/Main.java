package step05.p5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int phoneNumber[] = new int[word.length()];
        for(int i = 0; i < word.length(); i++) {
            phoneNumber[i] = change(word.charAt(i));
        }

        int time = 0;
        for(int i = 0; i < phoneNumber.length; i++) {
            time += phoneNumber[i] + 1;
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
    }

    public static int change(char c) {
        switch (c) {
            case 'A', 'B', 'C':
                return 2;
            case 'D', 'E', 'F':
                return 3;
            case 'G', 'H', 'I':
                return 4;
            case 'J', 'K', 'L':
                return 5;
            case 'M', 'N', 'O':
                return 6;
            case 'P', 'Q', 'R', 'S':
                return 7;
            case 'T', 'U', 'V':
                return 8;
            case 'W', 'X', 'Y', 'Z':
                return 9;
            default:
                return 0;
        }
    }
}
