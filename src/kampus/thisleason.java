package kampus;

public class thisleason {
    public static void main(String[] args) {
        String nama[] = new String[2];
        String kelas[] = new String[2];
        nama[0] = "Bejo";
        nama[1] = "Bejos";
        kelas[0]= "TIF 2A";
        kelas[1]= "TIF 2B";
        for (int i = 0; i <nama.length ; i++) {
            System.out.printf("Nama  =  %s \n kelas = %s %s\n",nama[i],kelas[i]);
        }

    }
}
