//Compiler version 1.8.0_111
import java.util.*;
import java.lang.*;

class Solution
{
    /**
     * @param {number[]} trip_durations
     * @param {number} total_hours
     * @return {number} min_purchases
     */

    public static int minPurchases(int[] trip_durations, int total_hours) {
        int min_purchases = -1;
        // Put your code here to calculate min_purchases

        Arrays.sort(trip_durations);
        int i=trip_durations.length-1;
        if (total_hours > trip_durations[0]) {
            min_purchases = 0;
            while (total_hours > 0 && i != 0) {
                if (total_hours >= trip_durations[i]) {
                    min_purchases++;
                    total_hours = total_hours - trip_durations[i];

                }
                if (total_hours < trip_durations[i]) {
                    i--;
                }
            }
        }

        // Return the result, do not change the structure
        return min_purchases;
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] components = sc.nextLine().split(" ");
        int[] trip_durations = new int[components.length];
        for(int i = 0; i < components.length; i++) trip_durations[i] = Integer.parseInt(components[i]);
        int total_hours = sc.nextInt();

        int min_purchases = Solution.minPurchases(trip_durations, total_hours);
        System.out.println(min_purchases);
    }
}
