package kampus.UAS;

public class UAS1 {
    //53. buatlah sebuah class!
    //73. sebuah perpustakaan mencata semua buku' koleksinya. buatlah class yang sesuai dengan kondisi tersebut
    //95. buatlah program untuk mencari produk berdasarkan nama produknya.

    String nama;
    String jenis;
    String ukuran;
    int harga;

    public UAS1(String nama, String jenis, String ukuran, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public void cetak(){
        System.out.printf("Nama Produk = %s\nJenisProduk = %s\nUkuran Produk = %s" +
                "\nHarga Produk = %d",nama,jenis,ukuran,harga);
    }
}
