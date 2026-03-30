package step06.p10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int i = 0;
        int j = word.length() - 1;
        boolean isPalindrome;
        while(true) {
            if(i >= j) {
                isPalindrome = true;
                break;
            }
            if(word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        if(isPalindrome) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
