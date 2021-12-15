/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.ArrayList;

/**
 *
 * @author cuong
 */
public class GenericCar<T> {

    ArrayList<T> prodContents;

    public GenericCar() {
        prodContents = new ArrayList<T>();
    }

    public ArrayList<T> getProdContents() {
        return prodContents;
    }

    public void setProdContents(ArrayList<T> prodContents) {
        this.prodContents = prodContents;
    }

    public void add(T ob1) {
        prodContents.add(ob1);
    }

    public void display() {
        for (T t : prodContents) {
            System.out.println(t.toString());
        }
    }

    public int getSize() {
        return prodContents.size();
    }

    public boolean checkEmpty() {
        if (prodContents.size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void grab() {
        for (T t : prodContents) {
            prodContents.remove(0);
            break;
        }
    }
}

