package rumah.PraUas;

public class TestUas2 {
    public static void main(String[] args) {
        int jumlah = 5;
        Mahasiswa TIFC[] = new Mahasiswa[jumlah];
            TIFC[0] =new Mahasiswa("aa","123",90,2003);
            TIFC[1] =new Mahasiswa("aab","1223",45,2004);
            TIFC[2] =new Mahasiswa("aac","1523",87,1998);
            TIFC[3] =new Mahasiswa("ad","12623",67,2002);
            TIFC[4] =new Mahasiswa("aae","1723",56,2001);


        for (int i = 0; i <TIFC.length-1 ; i++) {
            for (int j = 0; j <TIFC.length-1-i ; j++) {
               if(TIFC[j].nama.compareTo(TIFC[j+1].nama)>0){
                   Mahasiswa temp = TIFC[j];
                   TIFC[j]= TIFC[j+1];
                   TIFC[j+1]=temp;
               }

            }
        }
        for (int i = 0; i <TIFC.length ; i++) {
            TIFC[i].cetak();
        }
    }


}
