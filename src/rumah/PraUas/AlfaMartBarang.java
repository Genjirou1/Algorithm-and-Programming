package rumah.PraUas;

public class AlfaMartBarang {
    String nama;
    int stok;
    int id;
    int harga;

    public AlfaMartBarang(String nama, int stok, int id, int harga) {
        this.nama = nama;
        this.stok = stok;
        this.id = id;
        this.harga = harga;
    }
    public int beli(int jumlah){

        int total= 0;
        if (stok>0){
            total = harga*jumlah;
            stok-=jumlah;
        }
        return total;
    }
}
