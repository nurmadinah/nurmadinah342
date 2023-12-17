import java.util.Scanner;

public class LuasLayangLayang {
    public static void main(String[] args) {
        // Membaca panjang diagonal 1 dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang diagonal 1: ");
        double d1 = scanner.nextDouble();

        // Membaca panjang diagonal 2 dari pengguna
        System.out.print("Masukkan panjang diagonal 2: ");
        double d2 = scanner.nextDouble();

        // Menghitung luas layang-layang
        double luas = (d1 * d2) / 2;

        // Menampilkan hasil
        System.out.println("Luas layang-layang adalah: " + luas);

        // Menutup scanner
        scanner.close();
    }
}
