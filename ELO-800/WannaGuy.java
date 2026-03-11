// 469A - I Wanna Be the Guy

import java.util.Scanner;

public class WannaGuy{

    static boolean PassLevel(int n, int[] ps, int[] qs) {

        boolean[] passed = new boolean[n];

        for(int i = 0; i < ps.length; i++) {

            for(int j = 0; j < i; j++) {
                if(ps[j] == i+1) passed[j] = true;
            }

        }

        for(int i = 0; i < qs.length; i++) {

            for(int j = 0; j < i; j++) {
                if(qs[j] == i+1) passed[j] = true;
            }

        }


        for(int i = 0; i < n; i++) {
            if(!passed[i]) return false;
        }

        return true;

    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] ps = new int[n];
        int[] qs = new int[n-1];

        for(int i = 0; i < n; i++) {
            ps[i] = s.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            qs[i] = s.nextInt();
        }

        System.out.println(PassLevel(n, ps, qs) ? "I become the guy." : "Oh, my keyboard!");

        s.close();

    }
}