import java.util.Scanner;

public class latihan5 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int angka;
        // Input angka
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        // Cek kelipatan
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Master Class");
        } else if (angka % 3 == 0) {
            System.out.println("Pride of 3 ^ prime prime");
        } else if (angka % 5 == 0) {
            System.out.println("Pride of 5 ^ prime prime");
        } else {
            System.out.println("Bukan kelipatan 3 atau 5");
        }
    }
}
