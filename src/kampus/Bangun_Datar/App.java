package kampus.Bangun_Datar;

public class App {
    public static void main(String[] args) {
        Persegi x = new Persegi(10);
        cetakLuas(x);
        cetakKeliling(x);


    }
    public static void cetakLuas(InterfaceBD x){
        System.out.println("luas = "+x.luas());
    }
    public static void cetakKeliling(InterfaceBD x){
        System.out.println("Keliling = "+x.keliling());
    }
}
