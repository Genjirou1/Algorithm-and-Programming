package rumah.PraUas;

public class PROGRAM {
    public static void main(String[] args) {
        TOKO data [] = {
                new TOKO("ACER SWIFT 3", "01", 8000000, 2018),
                new TOKO("ACER ASPIRE", "02", 7500000, 2019),
                new TOKO("ACER NITRO", "03", 10000000, 2017),
                new TOKO("ACER SPIN", "04", 11000000, 2018)
        };

        for (int i = 0; i < data.length-1 ; i++) {
            for (int j = 0; j < data.length-1 ; j++) {
                if (data[j].kodebarang.compareTo(data[j+1].kodebarang)>0) {
                    //(data[j].harga > data[j+1].harga)
                    TOKO temp = data[j]; //pengurutan
                    data[j] = data[j+1];
                    data[j+1] = temp;


                }

            }

        }
        data[0].cetak();
    }

}


