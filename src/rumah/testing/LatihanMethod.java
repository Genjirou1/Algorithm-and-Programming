package rumah.testing;

public class LatihanMethod {
    public static void main(String[] args) {
       segitiga(100);

    }
    public static void  segitiga(int n){

        for (int i = 0; i <=n ; i++) {

            for (int j = 0; j <i; j++) {
                if (i%3==0){
                System.out.print("");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
