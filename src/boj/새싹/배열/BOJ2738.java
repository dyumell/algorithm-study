package boj.새싹.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2738 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]); int m = Integer.parseInt(inputs[1]);

        // m : 0 에서 n : 0 ~ n-1
        // ...
        // m : m -1 에서 n : 0 ~ n-1

        String[][] s = new String[n][m];
        int[][] matA = new int[n][m];


        for (int i =0; i<n ; i++){
            s[i] = br.readLine().split(" ");
            for (int j=0; j<m ; j++){
                matA[i][j] = Integer.parseInt(s[i][j]);
            }
        }

        s = new String[n][m];

        for (int i =0; i<n ; i++){
            s[i] = br.readLine().split(" ");
            for (int j=0; j<m ; j++){
                matA[i][j] += Integer.parseInt(s[i][j]);
            }
        }


        for (int i =0; i<n ; i++){
            for (int j=0; j<m ; j++){
                System.out.print(matA[i][j]);
                if(j != m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
