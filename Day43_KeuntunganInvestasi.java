import java.util.Scanner;

public class latihan9 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int modalAwal;
        int lamaInvestasi;
        double keuntungan;
        double totalInvestasi;

        // Input modal awal
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan modal awal: ");
        modalAwal = input.nextInt();

        // Input lama investasi
        System.out.print("Masukkan lama investasi (dalam tahun): ");
        lamaInvestasi = input.nextInt();

        // Hitung keuntungan per tahun
        keuntungan = 0.05 * modalAwal;

        // Hitung total investasi per tahun
        totalInvestasi = modalAwal + keuntungan;

        // Tampilkan hasil
        System.out.println("Keuntungan per tahun: " + keuntungan);
        System.out.println("Total investasi per tahun: " + totalInvestasi);

        // Cetak keuntungan setiap tahun
        for (int i = 1; i <= lamaInvestasi; i++) {
            System.out.println("Tahun ke-" + i + ": " + totalInvestasi);

            // Tambahkan keuntungan ke total investasi
            keuntungan = 0.05 * totalInvestasi;
            totalInvestasi += keuntungan;
        }
    }
}
