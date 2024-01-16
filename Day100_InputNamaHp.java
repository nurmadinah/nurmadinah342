import java.util.Scanner;

public class HargaHP {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk memasukkan merek HP
        System.out.print("Masukkan merek HP: ");
        
        // Mengambil input merek HP dari pengguna
        String merekHP = scanner.nextLine();

        // Memanggil metode untuk mendapatkan harga berdasarkan merek HP
        int harga = getHarga(merekHP);

        // Menampilkan harga ke layar
        if (harga != -1) {
            System.out.println("Harga HP merek " + merekHP + " adalah: Rp " + harga);
        } else {
            System.out.println("Maaf, merek HP tidak dikenali.");
        }

        // Menutup objek Scanner
        scanner.close();
    }

    // Metode untuk mendapatkan harga berdasarkan merek HP
    public static int getHarga(String merek) {
        switch (merek.toLowerCase()) {
            case "samsung":
                return 5000000;
            case "iphone":
                return 10000000;
            case "xiaomi":
                return 3000000;
            case "oppo":
                return 4000000;
            default:
                return -1; // Merek HP tidak dikenali
        }
    }
}
