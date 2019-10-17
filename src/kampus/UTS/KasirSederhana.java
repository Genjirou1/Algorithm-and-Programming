package kampus.UTS;

import java.util.Scanner;

public class KasirSederhana {



    static int hargaBeras = 10000;
    static int hargaGula = 10000;
    static int hargaMinyak = 10000;
    static int hargaGaram = 10000;
    static int hargaMentega = 10000;
    static void onOpen(){
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("| WELCOME TO INDOMAR    |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.printf("|BERAS\t\t= %d\t\t|\n" +
                             "|GULA\t\t= %d\t\t|\n"+
                             "|MINYAK\t\t= %d\t\t|\n"+
                             "|GARAM\t\t= %d\t\t|\n"+
                             "|Mentega\t= %d\t\t|\n",hargaBeras,hargaGula,hargaMinyak,hargaGaram,hargaMentega);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


    public static void main(String[] args) {
        onOpen();
        System.out.print("Berapa Jumlah Barang Belanjaan Anda :");
        int jumlahbarang = inputInt();

        String[] barang = new String[jumlahbarang];
        int[] jumlah = new  int[jumlahbarang];

        for (int i = 0; i <jumlahbarang ; i++) {
            System.out.print("Nama Barang (namabarang jumlah)=");
            String[] a = inputString().toLowerCase().split(" ");
            barang[i]=a[0];
            jumlah[i] = Integer.parseInt(a[1]);
        }
//
//        for (int i = 0; i <jumlahbarang ; i++) {
//            System.out.printf("Harga = %s = %d x %d = %d",barang[i],hargas(barang[i]),jumlah[i],
//                    jumlah[i]*hargas(barang[i]));
//        }
//        int total = 0;
//        for (int i = 0; i <jumlahbarang ; i++) {
//            total +=(hargas(barang[i])*jumlah[i]);
//        }
//        System.out.println("total = "+total);

//        System.out.print("Uang Anda :");
//        int uang = inputInt();
//
//        int kembalian = uang-total;
//        System.out.println("Kembalian :"+kembalian);
    }
    public static int hargas(String a){
        int harga = 0;
        switch (a){
            case "beras" : harga =hargaBeras;
            case "gula" : harga = hargaGula;
            case "minyak" : harga = hargaMinyak;
            case "garam" : harga = hargaGaram;
            case "mentega" : harga = hargaMentega;
            default: System.out.println("Barang tidak ada Silahkan input lagi");
        }
        return  harga;
    }
    public static int inputInt(){
        Scanner a = new Scanner(System.in);
        return a.nextInt();
    }
    public static String inputString(){
        Scanner a = new Scanner(System.in);
        return a.nextLine();
    }

}
