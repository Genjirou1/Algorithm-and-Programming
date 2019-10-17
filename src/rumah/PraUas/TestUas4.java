package rumah.PraUas;

public class TestUas4 {
    public static void main(String[] args) {
        int jumlah = 5;
        Mahasiswa data[] = {
                new Mahasiswa("Citra", "023", 78, 2003),
                new Mahasiswa("Widya", "391", 61, 2004),
                new Mahasiswa("Zainal", "820", 87, 1998),
                new Mahasiswa("Eka", "304", 90, 2002),
                new Mahasiswa("Budi", "211", 69, 2001),
            };

        for (int i = 0; i <data.length-1 ; i++) {
            for (int j = 0; j <data.length-1-i ; j++) {
               if(data[j].nama.charAt(0)>data[j+1].nama.charAt(0)){
                   Mahasiswa temp = data[j];
                   data[j]= data[j+1];
                   data[j+1]=temp;
               }

            }
        }
        for (int i = 0; i <data.length ; i++) {
            data[i].cetak();
        }

    }


}
