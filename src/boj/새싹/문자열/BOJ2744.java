package boj.새싹.문자열;

import java.io.*;

public class BOJ2744 {
    public static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] convertedStr = new char[input.length()];
        for (int i =0; i< input.length(); i++){
            if(input.charAt(i)>=97 && input.charAt(i)<=122){
                convertedStr[i] = (char)(input.charAt(i) - 32);
            } else {
                convertedStr[i] = (char)(input.charAt(i) + 32);
            }
        }
        System.out.println(convertedStr);
    }
}
