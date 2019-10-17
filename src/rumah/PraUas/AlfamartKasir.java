package rumah.PraUas;

import java.util.Scanner;

public class AlfamartKasir {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        AlfaMartBarang barang[] = {
                new AlfaMartBarang("Indomie Goreng",50,1,2500),
                new AlfaMartBarang("Indomie Rebus Kari Ayam",200,2,2500),
                new AlfaMartBarang("Sabun Mandi Detol ",150,3,13000),
                new AlfaMartBarang("Sisir Rambut ",2,4,5000),
                new AlfaMartBarang("Doritos Pedas ",152,5,15000),
                new AlfaMartBarang("Doritos Original",245,6,15000),
                new AlfaMartBarang("Susu Greenfield plain ",64,7,7000),
                new AlfaMartBarang("Pena Alfamart",216,8,3000),
                new AlfaMartBarang("Pensil Alfamart ",145,9,2000),
                new AlfaMartBarang("Penghapus Alfamart ",648,10,2700)
        };
        tampil(barang);

        System.out.print("Anda akan beli Barang Berapa banyak? :");
        int banyak = a.nextInt();
        int total[]= new int[banyak];

        for (int i = 0; i <banyak ; i++) {

            System.out.print("ID Barang :");
            int id = a.nextInt();
            System.out.print("Berapa Banyak :");
            int jumlah = a.nextInt();
            System.out.println();

            total[i]= barang[id].beli(jumlah);
            System.out.printf("Barang %d Dengan total %d\n",i,total[i]);
        }
        int totals = 0;
        for (int i = 0; i <total.length ; i++) {
            totals = totals+total[i];
        }

        System.out.println("Anda Akan Bayar  = "+totals );

    }
     public static void tampil (AlfaMartBarang[] a) {
         for (int i = 0; i <a.length ; i++) {
             System.out.printf("%d. Barang %s Stok %d ID %d Harga %d\n",i,a[i].nama,a[i].stok,a[i].id,a[i].harga);
         }

    }
}

