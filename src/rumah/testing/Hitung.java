package rumah.testing;

public class Hitung {
    public static void main(String[] args) {
        Segitiga a = new Segitiga();
        a.alas = 10;
        a.tinggi =5;
        System.out.printf("Alas = %d\nTinggi = %d\nLuas = %f",a.alas,a.tinggi,Hitung(a));
    }
    public static double Hitung(Segitiga a){
        return (a.alas*a.tinggi)/2;
    }
}
