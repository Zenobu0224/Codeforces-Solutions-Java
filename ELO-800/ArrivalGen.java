// 144A - Arrival of the General

import java.util.Scanner;

public class ArrivalGen {

    static int arrGenSteps(int[] soldier_height) {
        int n = soldier_height.length - 1;

        int tallest = Integer.MIN_VALUE;
        int shortest = Integer.MAX_VALUE;
        int tall_index = 0;
        int short_index = 0;
        int steps = 0;

        // Get the shortest height and the shortest height index
        for(int i = 0; i < n+1; i++) {
            if(soldier_height[i] <= shortest) {
                shortest = soldier_height[i];
                short_index = i;
            }
        }

        // Reposition the Shortest to the End of array
        for(int i = 0; i < n-short_index; i++) {
            if(soldier_height[short_index] < soldier_height[i+1]) {
                int temp = soldier_height[short_index];
                soldier_height[i] = soldier_height[i+1];
                soldier_height[i+1] = temp;
                steps++;
            }
        }

        // Get the tallest height and the tallest height index
        for(int i = 0; i < n+1; i++) {
            if(soldier_height[i] >= tallest) {
                tallest = soldier_height[i];
                tall_index = i;
            }
        }

        // Reposition the Tallest to the Front
        for(int i = tall_index; i > 0; i--) {
            if(soldier_height[i] > soldier_height[i-1]) {
                int temp = soldier_height[i];
                soldier_height[i] = soldier_height[i-1];
                soldier_height[i-1] = temp;
                steps++;
            }
        }

        return steps;

    }

    // static int lower_steps(int[] soldier_height) {

    //     int steps = 0;
    //     int min = 0;
    //     int min_height = Integer.MAX_VALUE;

    //     int n = soldier_height.length - 1;

    //     // Get the minimum height(index)
    //     for(int i = 0; i < n; i++) {
    //         if(soldier_height[i] <= min_height) {
    //             min_height = soldier_height[i];
    //             min = i;
    //         }
    //     }

    //     for(int i = 0; i < n-min; i++) {
    //         if(soldier_height[min] < soldier_height[i+1]) {
    //             int temp = soldier_height[min];
    //             soldier_height[min] = soldier_height[i+1];
    //             soldier_height[i+1] = temp;
    //             steps++;
    //         }
    //     }

    //     return steps;
    // }

    // static int higher_steps(int[] soldier_height) {
    //         int steps = 0;
    //         int tallest = Integer.MIN_VALUE;
    //         int tallest_index = 0;
    //         int n = soldier_height.length - 1;


    //        for(int i = 0; i < n+1; i++) {
    //             if(soldier_height[i] >= tallest) {
    //                 tallest = soldier_height[i];
    //                 tallest_index = i;
    //             }
    //         }
    //         for(int i = tallest_index; i > 0; i--) {
    //             if(soldier_height[i] > soldier_height[i-1]) {
    //                 int temp = soldier_height[i];
    //                 soldier_height[i] = soldier_height[i-1];
    //                 soldier_height[i-1] = temp;
    //                 steps++;
    //             }
    //         }
             

    //     return steps;

    // }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] soldier_height = new int[n];

        for(int i = 0; i < n; i++) {

            int a = s.nextInt();
            soldier_height[i] = a;

        }

        int minHeightSteps = lower_steps(soldier_height);
        // int maxHeightSteps = higher_steps(soldier_height);

        System.out.println(minHeightSteps);

        s.close();

    }
}
