/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author cuong
 */
public class StudentMarkTotal extends StudentMark {

    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal(int totalExamSubject, float everageMark) {
        super();
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal() {
        super();
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public int getTotalExamSubject(StudentMarkTotal[] arr) {
        return arr.length;
    }

    public void calculateEverageMark(StudentMarkTotal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            everageMark += arr[i].getMark();
        }
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }

}
