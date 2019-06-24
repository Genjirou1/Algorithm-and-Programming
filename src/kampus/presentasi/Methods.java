package kampus.presentasi;

public class Methods {
   //pembuatan Atribut kelas
    int a;
    int b;
    static int c ; // ini adalah sebuah atribut kelas
    public static void main(String[] args) {
        //construktor itu untuk mengset nilai default sebuah atribut yg kita panggil
        Methods a = new Methods();
        a.a = 10;
        a.b = 20;
//        a.cetak(); // pemanggilan  method non static
//
//        System.out.println(penjumlahan(10,2)+" << itu Adalah Hasil Penjumlahan  Parameter a dan b");
//        Methods b = new Methods(1,2); // seperti ini contohnya
//
//        methodInObject(b); // ini adalah pemanggilan object pada method

    }
    //construktor
    //Construktor itu bisa Banyak, tetapi tidak bisa memiliki fungsi yang sama...


    public Methods() { // ini adalah sebuah construktor kosong tidak ada parameternya
        System.out.println("Ini adalah Sebuah construktor ");
    }

    public Methods(int a) { // ini adalah sebuah construktor yang berisi parameter a yang di set dengan Atribut kelas (a)
        this.a = a;
    }

    public Methods(int a, int b) { // ini construktor yang berisi paramter a dan b ynag di set dengan Atribut kelas (a dan b)
        this.a = a;
        this.b = b;
    }
    //macam-Macam Method
    static int methodInObject(Methods x){
        System.out.println("Ini Adalah sebuah Pemangilan Objek yang berada pada Method");
        int sum = x.a+x.b;
        return sum;
    }

    void cetak(){
        System.out.print("Halo ini Adalah Method Void(hampa) dimana tidak diperlukan return");
        System.out.println();
    }
    static int penjumlahan(int a, int b){
        System.out.println("Ini Adalah method nonvoid dimana diperlukan return");
        int jumlah = a+b;
        return jumlah;
    }
}
