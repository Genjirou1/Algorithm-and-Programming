package rumah.testing;

public class InversMatriks {
    public static void main(String[] args) {
        // testing 2x2
        double[][] A = {{-2,3},{1,-1}};

        double det = (A[0][0]*A[1][1]) - (A[0][1]*A[1][0]);

        double determinant = 1/det;

        double[][] adj = {{A[1][1],-A[0][1]},{-A[1][0],A[0][0]}};

        double[][] inv = {{adj[0][0]*determinant , adj[0][1]*determinant},{adj[1][0]*determinant,adj[1][1]*determinant}};

        System.out.printf("A^-1 = \t%f %f \n\t\t%f %f",inv[0][0],inv[0][1],inv[1][0],inv[1][1]);
    }
}
