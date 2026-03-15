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

    static int higher_steps(int[] soldier_height) {
            int steps = 0;
            int tallest = Integer.MIN_VALUE;
            int tallest_index = 0;
            int n = soldier_height.length - 1;


           for(int i = 0; i < n+1; i++) {
                if(soldier_height[i] >= tallest) {
                    tallest = soldier_height[i];
                    tallest_index = i;
                }
            }
            for(int i = tallest_index; i > 0; i--) {
                if(soldier_height[i] > soldier_height[i-1]) {
                    int temp = soldier_height[i];
                    soldier_height[i] = soldier_height[i-1];
                    soldier_height[i-1] = temp;
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

        // int minHeightSteps = lower_steps(soldier_height);
        int maxHeightSteps = higher_steps(soldier_height);

        System.out.println(maxHeightSteps);

        s.close();

    }
}
