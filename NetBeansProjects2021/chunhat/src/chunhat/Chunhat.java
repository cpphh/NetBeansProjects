
package chunhat;


public class Chunhat {
    String ngay;
    Double ng;

    public Chunhat() {
    }

    public Chunhat(String ngay, Double ng) {
        this.ngay = ngay;
        this.ng = ng;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public Double getNg() {
        return ng;
    }

    public void setNg(Double ng) {
        this.ng = ng;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Chunhat b=new Chunhat();
        b.setNgay("abc");
        b.setNg(4000d);
        System.out.println("In b: "+b.ngay);
        System.out.println("Ng: "+b.getNg());
        Student a=new Student();
        a.name="cuong";
        a.speak();
    }
    
}

