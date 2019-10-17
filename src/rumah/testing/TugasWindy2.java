package rumah.testing;

import java.util.Scanner;

public class TugasWindy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        System.out.print("Masukkan Jari-jari:");
        int jari = input.nextInt();
        System.out.print("Masukkan Tinggi");
        int tinggi = input.nextInt();

        double volume  = pi*jari*jari*tinggi;
        System.out.println("Jari-jari Tabung = "+jari+"\n Tinggi Tabung= "+tinggi+"\nvolume tabung = "+volume);
    }
}
