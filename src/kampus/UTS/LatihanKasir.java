package kampus.UTS;

import java.sql.SQLOutput;

public class LatihanKasir {
    String kb;
    String[] splits = kb.split("-");
    String namaBarang = splits[0];
    int disc =Integer.parseInt(splits[1])/100;
    int banyak;
    int harga;
    public static void main(String[] args) {
        LatihanKasir x = new LatihanKasir();
        x.kb = "Milo-20";
        x.banyak = 2;
        x.harga = 1000;
        x.Print(x);

    }
    double total (LatihanKasir a){
        double price = harga*banyak;
        double total = price*disc;
        return total;
    }
    void Print(LatihanKasir a){
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Kode Barang : "+kb);
        System.out.println("Discount : "+disc);
        System.out.println("Banyak : "+banyak);
        System.out.println("Harga : " +harga);
        System.out.println("Total : "+total(a));
    }
}
