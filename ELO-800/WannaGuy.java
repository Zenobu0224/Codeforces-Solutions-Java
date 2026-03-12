// 469A - I Wanna Be the Guy

import java.util.Scanner;

public class WannaGuy{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        boolean[] passed = new boolean[n];
    
        int p_pass = s.nextInt();
        for(int i = 0; i < p_pass; i++) {
        int p = s.nextInt();

        passed[p-1] = true;
        }    
        
        int q_pass = s.nextInt();
        for(int i = 0; i < n-1; i++) {
            int q = s.nextInt();

            passed[q-1] = true;
        }

        boolean passed_all = true;
        for(int i = 0; i < n; i++) {
            if(!passed[i]){
                passed_all = false;
                break;
            }
        }

        System.out.println(passed_all ? "I become the guy." : "Oh, my keyboard!");

        s.close();

    }
}