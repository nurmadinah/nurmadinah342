import java.util.Scanner;

public class latihan10 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int angka1;
        int angka2;
        int jumlah;

        // Input angka 1 dan angka 2
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1: ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2: ");
        angka2 = input.nextInt();

        // Hitung jumlah
        jumlah = angka1 + angka2;

        // Tambahkan 1 jika jumlah genap
        if (jumlah % 2 == 0) {
            jumlah++;
        }

        // Tambahkan 2 jika jumlah ganjil
        else {
            jumlah += 2;
        }

        // Tampilkan hasil
        System.out.println("Hasil: " + jumlah);
    }
}
