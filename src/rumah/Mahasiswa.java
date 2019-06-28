package rumah;

public class Mahasiswa {
    public String nama;
    public String nim;
    public int nilai;
    public int tahunlahir;

    public int umur(){
        return 2019-tahunlahir;
    }

    public  void cetak (){
        System.out.println("Nama = "+nama);
        System.out.println("Nim = "+nim);
        System.out.println("Nilai = "+nilai);
        System.out.println("Umur = "+umur());
    }

    public Mahasiswa(String nama, String nim, int nilai, int tahunlahir) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.tahunlahir = tahunlahir;
    }
}
