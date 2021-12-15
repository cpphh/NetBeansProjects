
package vietpro;

/**
 *
 * @author C
 */
public class Vietpro {

    public static void main(String[] args) {
        // TODO code application logic here
        final float pii=3.14f;//hang so
        int a=10;
        if(a<0)
        {
            System.out.println("a la so am");
            
        }
        else if(a>0){
            System.out.println("a la so duong");
        }
        else
        {
            System.out.println("a la so 0");
        }
        //switch
        int n=2;
        switch(n)
        {
            case 1:
                System.out.println("Thang 1");
                break;
            case 2:
                System.out.println("thang 2");
                break;
            case 3:
                System.out.println("thang 3");
                break;
            case 4:
                System.out.println("thang 4");
                break;
            default:
                System.out.println("Thang nhap khong co");
        }
        
        int i=1;
        do{
           System.out.print(i);
            i++; 
        }
        while(i<=10);
        
        XeDap xd=new XeDap();
        xd.mauSac= "mau do";
        System.out.println(xd.mauSac);
        xd.BopPhanh();
        
        SinhVien2 sv=new SinhVien2();
        sv.DiHoc();
        sv.DiHoc("Di Hoc String");
        
        try{
            int b=10;
            System.out.println(b/0);
            
        }catch(Exception e)
        {
            System.out.println("Khong duoc phep chia cho 0");
        }finally{
            System.out.println("Kieu gi cung chay");
        }
        
        int mang[];
        mang= new int[10];
        mang[0]=2;
        mang[1]=4;
        mang[2]=6;
        mang[3]=8;
        System.out.println(mang[2]);
        System.out.println(mang.length);
        for(int c=0; c<mang.length; c++)
        {
            System.out.print(mang[c]);
        }
        
        String d="Hoc Vien Cong Nghe Pro";
        System.out.println("\n"+d);
        System.out.println(d.length());
        System.out.println(d.charAt(4));
        System.out.println(d.replace(" ","-"));
        System.out.println(d.substring(4));
        System.out.println(d.substring(4, 8));
        
    }
}
    
    class XeDap{
        public String mauSac;
        public void BopPhanh(){
            System.out.println("Bop Phanh");
        }
    }
class SinhVien{
    public void DiHoc(){
        System.out.println("Di Hoc");
    }
}
class SinhVien1 extends SinhVien{
    
}
class SinhVien2 extends SinhVien1{
    public void DiHoc(){
        super.DiHoc();
        System.out.println("Sinh Vien Di Hoc");
    }
    public void DiHoc(String s)
    {
        System.out.println(s);
    }
}

/*
interface Sinhvien{
    public void dihoc();
    public void nghihoc();
}
interface Sinhvien1{
    public void dihoc1();
}
class Sinhvien2 implements Sinhvien,Sinhvien1{
    public void dihoc(){
        
    }
    public void nghihoc(){
        
    }
    public void dihoc1(){
        
    }
}
*/
    