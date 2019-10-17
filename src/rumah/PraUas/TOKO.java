package rumah.PraUas;

public class TOKO {
    public String barang ;
    public String kodebarang;
    public int harga;
    public int expired;

 public TOKO (String br,String kd,int hg,int ex) {
    barang = br;
    kodebarang = kd;
    harga = hg;
    expired = ex;
}
public void cetak () {
    System.out.println(" PROGRAM PENGURUTAN TOKO LEPTOP");
    System.out.println("NAMA BARANG =" + barang);
    System.out.println("KODE BARANG =" + kodebarang);
    System.out.println("HARGA BARANG =" + harga);
    System.out.println("Expired sampai =" + kadaluarsa());
}
public int kadaluarsa() {
    return expired + 1;
}
}
