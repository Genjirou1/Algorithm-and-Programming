package kampus.presentasi;

public class Arrays {
    public static void main(String[] args) {
        int[] A ={1,2,3,4}; // pembuatan array 1 dimensi
        int[][] B={{1,2},{3,4}}; // pembuatan array 2 dimensi yaitu 2x2
        System.out.printf(" A | %d %d %d %d|\n\n",A[0],A[1],A[2],A[3]);
        System.out.printf("B \t| %d %d |  \n\t| %d %d |  ",B[0][0],B[0][1],B[1][0],B[1][1]); // kita coba print dalam bentuk Matriks
    }
}
