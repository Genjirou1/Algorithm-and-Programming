package kampus;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int B[] = new int[10];

        Scanner scn = new Scanner(System.in);
        int i ;
        for (i = 0; i <5 ; i++) {
            System.out.println("Masukkan Angka anda");
            B[i]=scn.nextInt();
        }

        for (int j = 0; i>j ; j++) {
            System.out.println("Angka ke "+j+" = "+B[j]);
        }
    }
}
