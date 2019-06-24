package rumah;

public class TestUas3 {
    public static void main(String[] args) {
        int jumlah = 5;
        Mahasiswa TIFC[] = {
                new Mahasiswa("aa", "123", 90, 2003),
                new Mahasiswa("bab", "1223", 45, 2004),
                new Mahasiswa("dac", "1523", 87, 1998),
                new Mahasiswa("cd", "12623", 67, 2002),
                new Mahasiswa("eae", "1723", 56, 2001),
            };

        for (int i = 0; i <TIFC.length-1 ; i++) {
            for (int j = 0; j <TIFC.length-1-i ; j++) {
               if(TIFC[j].nama.charAt(0)>TIFC[j+1].nama.charAt(0)){
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
