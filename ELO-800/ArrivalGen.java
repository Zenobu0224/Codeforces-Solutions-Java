// 144A - Arrival of the General

import java.util.Scanner;

public class ArrivalGen {

    static int lower_steps(int[] soldier_height) {

        int steps = 0;
        int min = Integer.MAX_VALUE;

        int n = soldier_height.length - 1;

        // Get the minimum height(index)
        for(int i = 0; i < n; i++) {
            if(soldier_height[i] <= min) min = i;
        }

        for(int i = 0; i < n-min; i++) {
            if(soldier_height[min] < soldier_height[i+1]) {
                int temp = soldier_height[min];
                soldier_height[min] = soldier_height[i+1];
                soldier_height[i+1] = temp;
                steps++;
            }
        }

        return steps;
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
