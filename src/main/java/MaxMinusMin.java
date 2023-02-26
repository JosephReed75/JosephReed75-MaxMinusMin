
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        // Sort list in Ascending order
        Collections.sort(nums);
        // Get first element for min
        int min = nums.get(0);
        // Get last element for max
        int max = nums.get(nums.size() - 1);

        // Subtract min from max
        return max - min;
    }
}
