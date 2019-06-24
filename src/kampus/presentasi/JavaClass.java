package kampus.presentasi;
//public class ContohClass{         << Ini tidak Bisa Karena Java Class Itu Hanya boleh sama dengan nama Filenya.
//
//}
public class JavaClass {        // <ini namanya class
    String nama; // ini namanya Property


        public static void Cetak(JavaClass a){ // ini sebuah Method untuk mencetak yang ada didalam objek
            System.out.println(a.nama);

        }
    public static void main(String[] args) {
        JavaClass a= new JavaClass(); // a itu namanya Object Kelas
        a.nama = "Testing"; // ini namnanya Deklarasi Sebuah variabel property kelas milik JavaClass.

        JavaClass b = new JavaClass();
        b.nama = "Test";

            Cetak(b);

    }
}

