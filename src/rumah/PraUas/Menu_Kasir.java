package rumah.PraUas;
import rumah.PraUas.Menu;

import java.util.Scanner;

public class Menu_Kasir {
    Scanner input = new Scanner(System.in);
    public void input(){
        int jumlah = input.nextInt();

    }


    public static void main(String[] args) {
        Menu Makanan[]= {
                new Menu("Makanan",0),
                new Menu("Mie ayam GUGUN",10000),
                new Menu("Mie Aceh Faizah",12000),
                new Menu("Mie Aceh Faizah Special",22000)
        };
        Menu Minuman[]= {
                new Menu("Minuman ",0),
                new Menu("Teh ",4000),
                new Menu("Teh Es",5000),
                new Menu("Jeruk Panas",5000),
                new Menu("Jeruk Dingin",5000)
        };
        Makanan[0].cetak();
        for (int i = 1; i <Makanan.length ; i++) {
            Makanan[i].print(i);
        }


    }
}
