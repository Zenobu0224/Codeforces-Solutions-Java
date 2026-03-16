// 144A - Arrival of the General

import java.util.Scanner;

public class ArrivalGen {

    static int arrGenSteps(int[] soldier_height) {

        int n = soldier_height.length;
        int shortest = Integer.MAX_VALUE;
        int tallest = Integer.MIN_VALUE;
        int short_index = 0;
        int tall_index = 0;
        int steps = 0;

        for(int i = 0; i < n; i++) {
            if(soldier_height[i] > tallest) {
                tallest = soldier_height[i];
                tall_index = i;
            }

            if(soldier_height[i] <= shortest) {
                shortest = soldier_height[i];
                short_index = i;
            }
        }

        steps = tall_index + (n - 1 - short_index);

        if(tall_index > short_index) steps--;

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

        int totalSteps = arrGenSteps(soldier_height);

        System.out.println(totalSteps);

        s.close();

    }
}
