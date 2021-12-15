/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Engine {

    public String engineId;
    public String engineName;
    public String manufacturer;
    public int yearMaking;
    public float price;

    public Engine() {
    }

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" + "engineId=" + engineId + ", engineName=" + engineName + ", manufacturer=" + manufacturer + ", yearMaking=" + yearMaking + ", price=" + price + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap id: ");
        engineId = sc.nextLine();
        System.out.println("Moi nhap ten:");
        engineName = sc.nextLine();
        System.out.println("Moi nhap manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.println("Moi nhap nam: ");
        yearMaking = sc.nextInt();
        System.out.println("Moi nhap gia: ");
        price = sc.nextFloat();
    }

    public void output() {
        System.out.println(toString());
    }
}
