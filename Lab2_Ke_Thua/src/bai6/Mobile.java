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
public class Mobile extends Engine {

    private String country;

    public Mobile() {
    }

    public Mobile(String country) {
        this.country = country;
    }

    public Mobile(String country, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Mobile{" + "country=" + country + '}';
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nuoc san xuat: " + country);
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap nuoc san xuat: ");
        country = sc.nextLine();

    }

}
