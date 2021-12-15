/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class Car extends Engine{
    private int totalSeat;
    private float speed;

    public Car() {
    }

    public Car(int totalSeat, float speed) {
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public Car(int totalSeat, float speed, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("So cho ngoi: "+totalSeat);
        System.out.println("Toc do: "+speed);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so cho ngoi: ");
        totalSeat = sc.nextInt();
        System.out.println("Moi nhap toc do: ");
        speed = sc.nextFloat();
    }
    
    
    
}

