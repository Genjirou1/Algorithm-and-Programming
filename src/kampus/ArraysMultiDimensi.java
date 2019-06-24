package kampus;

public class ArraysMultiDimensi {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        a[2][2] = 20;
        System.out.println(a.length);
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
