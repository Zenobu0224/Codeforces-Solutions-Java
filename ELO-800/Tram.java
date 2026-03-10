// 116A - Tram

import java.util.Scanner;

public class Tram{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int max_cap = 0;
        int remain = 0;
        int n = s.nextInt();

        for(int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            remain = remain - a + b;

            if(remain > max_cap) max_cap = remain;
        }

        System.out.println(max_cap);

        s.close();

    }
}