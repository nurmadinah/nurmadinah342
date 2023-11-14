import java.util.Scanner;

public class latihan3 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int batasAtas;
        int total = 0;

        // Input batas atas
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        batasAtas = input.nextInt();

        // Hitung total penjumlahan
        for (int i = 1; i <= batasAtas; i++) {
            total += i;
        }

        // Tampilkan total penjumlahan
        System.out.println("Total penjumlahan: " + total);
    }
}
