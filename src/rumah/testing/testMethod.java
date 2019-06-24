package rumah.testing;

import javax.swing.*;

public class testMethod {
    public static int LuasPersegi(int p, int l){
        return p*l;
    }
    public static int kelilingPergsegi(int p , int l){
        return (p+l)*2;
    }
    public static int luasLingkaran(int r){return 3*r*r;}
    public static void main(String[] args) {
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar"));
        System.out.println("luas="+LuasPersegi(panjang,lebar));
        System.out.println("keliling="+kelilingPergsegi(panjang,lebar));
        System.out.println("LuasLingkaran ="+luasLingkaran(2));
    }
}
