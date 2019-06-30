package rumah.PraUas;

public class Menu {
    private String nama;
    private  int harga;

    public void cetak (){
        System.out.printf("|\t Menu %s \t  |\n",this.nama);
    }
    public void print(int i) {

        System.out.printf("|\t "+i+". %s.\t\t\t \n",this.nama);
        System.out.printf("|\t Harga :%d\t\t\t  \n",this.harga);
    }
    public  int total (int jumlah){
         int total =harga*jumlah;
         return total;
    }
    public  int bayar (int bayar ,int total){
        return total-bayar;
    }

    public Menu(String nama,int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}
