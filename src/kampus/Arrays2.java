package kampus;

public class Arrays2 {
    public static void main(String[] args) {
        int []a = new int[5];
        
        a[0] = 10;
        a[1] = 120;
        a[2] = 140;
        a[3] = 150;
        a[4] = 110;

        int b = 1;

        for (int i = 0; i <a.length ; i++) {

            System.out.println(" Nilai "+b+" = "+a[i]);
            b++;
        }
    }
}
