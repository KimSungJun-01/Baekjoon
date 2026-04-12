package step08.p1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 1;
        int count = 1;
        int value = 1;
        boolean flag = true;
        while(true) {
            if(x == count) {
                break;
            }
            if(!flag) {
                if(a == value) {
                    a++;
                    value++;
                    count++;
                    flag = true;
                    continue;
                }
            } else {
                if(b == value) {
                    b++;
                    value++;
                    count++;
                    flag = false;
                    continue;
                }
            }

            if(!flag) {
                b--;
                a++;
                count++;
            } else {
                a--;
                b++;
                count++;
            }
        }

        bw.write(String.valueOf(a + "/" + b));
        bw.flush();
        bw.close();
    }
}
