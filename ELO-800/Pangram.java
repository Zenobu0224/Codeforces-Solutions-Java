// PROBLEM : 520A - Pangram

import java.util.Scanner;

public class Pangram{

    static final int MAX_ALP = 26;
    
    static boolean CheckPangram(int n, String str) {

        boolean[] letters = new boolean[MAX_ALP];

        for(int i = 0; i < n; i++) {

            char c = str.charAt(i);

            if(c >= 'A' && c <= 'Z') letters[c - 'A'] = true;
            else if(c >= 'a' && c <= 'z') letters[c - 'a'] = true;

        }

        for(int i = 0; i < MAX_ALP; i++) {
            if(!letters[i]) return false;
        }

        return true;

    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();
        
        String str = s.nextLine();

        System.out.println(CheckPangram(n, str) ? "YES" : "NO");

    }
}