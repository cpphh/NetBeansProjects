/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Arrays;

/**
 *
 * @author C
 */
public class Bai13 {

    void InsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > value) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = value;
        }
    }

    public static void main(String args[]) {
        Bai13 ob = new Bai13();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Mang ban dau:");
        System.out.println(Arrays.toString(nums));
        ob.InsertionSort(nums);
        System.out.println("Mang sau khi sap xep:");
        System.out.println(Arrays.toString(nums));
    }
}
