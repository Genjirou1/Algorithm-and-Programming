package rumah.PraUas;

public class SoalIndri {

     static void search(int[]a,int dicari){
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==dicari) {
                System.out.printf("Angka %d Berada di Index ke %d\n",dicari,i);
            }
        }
    }

    static void sort (int[] a){
        for (int x = 0; x <a.length-1 ; x++) {
            for (int i = 0; i <a.length-1-x ; i++) {
                if (a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]= temp;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
     }

    public static void main(String[] args) {
        int[] angka = {1,4,2,10,2,8};
        int katakunci = 10;

        search(angka,katakunci);
        sort(angka);
        System.out.println("Index yang digunakan Sebanyak = "+angka.length);

    }
}
