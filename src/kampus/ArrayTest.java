package kampus;

public class ArrayTest {
    public static void main(String[] args) {
        int a[] = {10};
        int b[] = a;
        a[0] = 20;

        int c = 12;
        int d = c;
        c = 20;

        System.out.println(b[0]);
        System.out.println(d);
    }
}
