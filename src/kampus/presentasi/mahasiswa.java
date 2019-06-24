package kampus.presentasi;
//class
public class mahasiswa { //mahasiswa merupakan yang di namakan class
    String nama ;
    public static void cetak(mahasiswa object) { //public static void merupakan yang dinamakan method
        System.out.println(object.nama);
    }
    public static void main(String[] args) {
        mahasiswa object = new mahasiswa (); //yang dinamakan objek di sini adalah object
        object.nama = "test";

        cetak (object);
    }
}


