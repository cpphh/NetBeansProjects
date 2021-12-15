/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author cuong
 */
public class ComparatorsExampleTest {

    public static void main(String[] args) {
        Comparator<String> sizeOrder = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : s1.compareTo(s2);
            }
        };
        Collection<String> strings = Arrays.asList("AAA", "aaa", "CCC", "f");
        System.out.println(ComparatorsEx.max(strings));
        System.out.println(ComparatorsEx.min(strings));
        System.out.println(ComparatorsEx.max(strings, sizeOrder));
        System.out.println(ComparatorsEx.min(strings, sizeOrder));
    }

}
