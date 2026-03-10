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
                System.out.println("Remain : " + remain);
                max_cap = remain;
                System.out.println("Max Capacity : " + max_cap);
                continue;
            }

            remain = (max_cap - a) + b;
            System.out.println("Max Capacity : " + remain);

            if(max_cap < remain) max_cap = remain;
        }

        System.out.println("\n\n" + max_cap);

        s.close();

    }
}