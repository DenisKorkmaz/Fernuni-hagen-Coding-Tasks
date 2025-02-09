package Lektion_2;

import java.util.Arrays;

public class adHoc3 {
    public static void main(String[] args) {

        int[] nums = {33, 66, 23, 6, 1, 6, 2, 5, 88};

        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));


    }
}
