/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

/**
 *
 * @author C
 */
public class Bai19 {

    public static void main(String args[]) {
        int[][] score = {
            {60, 55, 70},
            {80, 60, 41}
        };
        int[] sum = new int[2];    // tổng mảng
        // tổng của sinh viên 1
        sum[0] = 0;
        // tổng của sinh viên 2
        sum[1] = 0;
        // trung bình mảng
        float[] avg = new float[2];
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                sum[r] += score[r][c];
            }
        }
        // trung bình của sinh viên 1
        avg[0] = (float) sum[0] / 3;
        // trung bình của sinh viên 2
        avg[1] = (float) sum[1] / 3;
        System.out.println("Average score of 1st student = " + avg[0]);
        System.out.println("Average score of 2nd student = " + avg[1]);
    }

}
