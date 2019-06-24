package kampus.Bangun_Datar;

public class Persegi implements InterfaceBD {
    public int sisi;
    @Override
    public double luas() {
        return sisi*sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi;
    }

    public Persegi() {
    }

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
}
