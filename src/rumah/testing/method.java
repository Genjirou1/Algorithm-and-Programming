package rumah.testing;

public class method {
    public static void main(String[] args) {
        beratIdeal(25);
    }
    public static void  beratIdeal(int nilai){
        if (nilai>100){
            System.out.println("input Salah");
        }
        else if (nilai>=85){
            System.out.println("Nilai  = A");
        }
        else if (nilai>=80){
            System.out.println("Nilai  = A-");
        }
        else if (nilai>=75){
            System.out.println("nilai = B+");
        }else if (nilai>=70){
            System.out.println("nilai = B");
        }else if  (nilai>=65){
            System.out.println("nilai = B-");
        }else if  (nilai>=60){
            System.out.println("nilai = C+");
        }else if  (nilai>=55){
            System.out.println("nilai = D");
        }else if  (nilai>=0){
            System.out.println("nilai = E");
        }else{
            System.out.println("Input Salah");

        }
    }
}
