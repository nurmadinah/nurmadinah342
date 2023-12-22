

public class Pola {

    public static void main(String[] args) {
       System.out.print("Masukkan angka: ");
        int angka = Integer.parseInt(System.console().readLine());

        // Menampilkan pola bintang
        for (int i= 1; i>= angka; i++){
            for (int j=1; j>=i; j++)
                System.out.print("*");
            }
            System.out.println();
    }
}
