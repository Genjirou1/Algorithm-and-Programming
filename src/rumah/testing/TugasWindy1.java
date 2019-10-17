package rumah.testing;

import java.util.Scanner;

public class TugasWindy1 {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang Jari-jari :");
        int jari = input.nextInt();

        double luas = (double) jari*jari*pi;

        System.out.println("Jari-jari = "+jari+"\n Luas : "+luas);
    }
}
