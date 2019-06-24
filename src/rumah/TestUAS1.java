package rumah;

import java.util.Scanner;

public class TestUAS1 {

    static int inputInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    static String input(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa = ");
        int mhs = inputInt();


        String nama[] = new String[mhs];
        int nilaiTugas[] = new int[mhs];
        int nilaiUTS[] = new int[mhs];
        int nilaiUAS[] = new int[mhs];

        for (int i = 0; i < mhs-1 ; i++) {
            System.out.println("Mahasiswa ke " + (i+1));
            System.out.print("Nama Mahasiswa \t = ");
            nama[i] = input();
            System.out.print("Nilai Tugas ");
            nilaiTugas[i] = inputInt();
            System.out.print("Nilai UTS ");
            nilaiUTS[i] = inputInt();
            System.out.print("Nilai UAS ");
            nilaiUAS[i] = inputInt();
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("                    DAFTAR NILAI                     ");
        System.out.println("-----------------------------------------------------");
        System.out.println("No \t Nama \t\t\t Nilai \t\t\t\t\t Grade             ");
        System.out.println("  \t     \t Tugas \t UTS \t UAS  \t\t\t              ");


    }
}
