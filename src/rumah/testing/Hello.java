package rumah.testing;

public class Hello {
    public static void main(String[] args) {
        System.out.println("halo ");
        PersegiPanjang a = new PersegiPanjang();
        a.nama = "A";
        a.panjang = 10;
        a.lebar = 15;

        a.Luas();
        a.nama = "B";
        a.panjang =25;
        a.lebar = 20;
        a.Keliling();
    }
}
