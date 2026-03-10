// 116A - Tram

import java.util.Scanner;

public class Tram{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int max_cap = 0;
        int remain = 0;
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("\n\nIteration : " + (i+1));
            int a = s.nextInt();
            int b = s.nextInt();

            if(i == 0) {
                remain = b - a;
                max_cap = remain;
                continue;
            }

            remain -= a;
            max_cap = remain + b;
        }

        System.out.println(max_cap);

        s.close();

    }
}