/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg30_4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<String> a=new ArrayList<>();
        a.add("cuong");
        try {
            //Tạo đối tượng liên kết
            FileOutputStream fos=new FileOutputStream("d:/setup/t.txt");
            DataOutputStream dos=new DataOutputStream(fos);
            //Ghi dữ liệu
            dos.writeInt(100);
            dos.writeDouble(9.5);
            
            fos.close();
            dos.close();
            System.out.println("Đã xong!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
