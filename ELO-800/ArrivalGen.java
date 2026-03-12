// 144A - Arrival of the General

import java.util.Scanner;

public class ArrivalGen {

    static int[] heightFL(int[] soldier_height) {

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        int steps = 0;


        for(int i = 0; i < soldier_height.length; i++) {

            if(lowest <= soldier_height[i]) lowest = i;

        }

        for(int i = lowest+1; i < soldier_height.length - (lowest+1); i++) {
            int lowest_i = i;
            if(soldier_height[i] < soldier_height[lowest]){
    
                soldier_height[]

            }
        }



    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] soldier_height = new int[n];

        for(int i = 0; i < n; i++) {

            int a = s.nextInt();
            soldier_height[i] = a;

        }

        s.close();

    }
}
