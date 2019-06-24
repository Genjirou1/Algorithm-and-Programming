package kampus.quiz1;

public class NilaiSiswa {
    public static void main(String[] args) {

        cetak();
        //nilai tugas = % nilai uts = 35% nilai quiz = 15% nilai UAS= 40%
    }
    public static double nilaiMataKuliah(int nilaiTugas , int nilaiUTS,int nilaiQuiz,int nilaiUAS){
        double total = (nilaiTugas+nilaiUTS+nilaiQuiz+nilaiUAS)/4;
        return  total;
    }
    public static void cetak(){
        System.out.println(nilaiMataKuliah(100,100,100,100));
    }
}
