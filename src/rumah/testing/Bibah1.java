package rumah.testing;

import java.util.Scanner;

public class Bibah1 {
    public static void main(String[] args) {
        int pin = 524683;


        int ulang;
        int i=0;
        while(i<4){

            ulang =i;
            Scanner a = new Scanner(System.in);
            if (ulang<3){
                System.out.print("Masukkan Pin anda: ");
                int inputPin = a.nextInt();
                if (inputPin == pin ){
                    System.out.println("Login Berhasil");
                    System.out.println("Program Berakhir");
                    break;
                }else {
                    System.out.println("Pin salah!");
                }
            }else{
                System.out.println("Pin salah 3 kali Program Berakhir");
                break;
            }
            i++;
        }
    }
}
