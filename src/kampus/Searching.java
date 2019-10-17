package kampus;

public class Searching {
    public static void main(String[] args) {
        int[] nilai  = {123,123,4,5,21,12,3,5,5,12,3,5,12,23,54,5,12,3,5,2,4,5,6,12,2,34,5,652,3};
        int banyakmuncul = 0;
        int keyword= 5;
        for (int i = 0; i <nilai.length ; i++) {
            if (nilai[i]==keyword){
                System.out.println(nilai[i]+" Berada pada index ke "+i);
                banyakmuncul++;
            }
        }
        pembatas();
        if (banyakmuncul == 0 ){
            System.out.printf("%d Tidak ditemukan",keyword);
        }else{
            System.out.printf("%d muncul sebanyak %d Kali ",keyword,banyakmuncul);
        }
        pembatas();



        String[] nama ={"Budi"
                ,"Amin"
                ,"Adnrian"
                ,"Ridha"
                ,"Bambang"
                ,"Baban"
                ,"Babun"
                ,"Ridho"
                ,"Wira"
                ,"Andrian"

                ,"Wira"
        };
        String keywords="Amin";
        int jumlah = 0;
        for (int i = 0; i <nama.length ; i++) {
            if (nama[i]==keywords){
                System.out.println(nama[i]+" Berada pada index ke "+i);
                jumlah++;

            }
        }


    }
    public static void pembatas(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}


