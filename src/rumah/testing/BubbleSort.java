package rumah.testing;

public class BubbleSort {
    public static void main(String[] args) {
         int[] data = {2,5,1,6,7,3,4};

        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+" ");
        }
        int check = 1;
        System.out.println();
        for (int j= 0; j <data.length-1 ; ++j) {

            for (int i = 0; i <data.length-1-j; i++) {
                System.out.println("Repeat "+check);
                check++;
            if (data[i]> data[i+1]){
                int swap = data[i];
                data[i]=data[i+1];
                data[i+1]=swap;
                }
            }
        }
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
