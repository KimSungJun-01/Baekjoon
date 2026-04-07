package step08.p2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int currentRoom = 1;
        int baseRoom = 1;
        int i = 1;
        int path = 1;
        while(true) {
            if(currentRoom == n) {
                break;
            }
            currentRoom++;
            if(currentRoom > baseRoom) {
                baseRoom += 6 * i++;
                path++;
            }
        }

        bw.write(String.valueOf(path));
        bw.flush();
        bw.close();
    }
}
