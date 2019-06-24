package rumah.testing;

public class PersegiPanjang {

    String nama;
    int panjang;
    int lebar;

    public int Luas(){
        int luas = panjang*lebar;
        System.out.printf("Luas Persegi Panjang %s :\nPanjang = %d \nLebar = %d\nLuas = %d\n",nama,panjang,lebar,luas);
        return luas;
    }
    public int Keliling(){
        int keliling = (panjang*lebar)*2;
        System.out.printf("Keliling Persegi Panjang %s :\nPanjang = %d \nLebar = %d\nKeliling = %d\n",nama,panjang,lebar,keliling);
        return keliling;
    }
}
