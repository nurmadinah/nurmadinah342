import java.util.Scanner;

public class latihan {

    public static void main(String[] args) {
        // Deklarasi variabel
        int gajiPokok;
        int lamaLembur;
        int gajiLembur;
        int gajiBersih;
        // Input gaji pokok
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();
        // Input lama lembur
        System.out.print("Masukkan lama lembur (dalam jam): ");
        lamaLembur = input.nextInt();
        // Hitung gaji lembur
        gajiLembur = lamaLembur * 55000;
        // Hitung gaji bersih
        gajiBersih = gajiPokok + gajiLembur;
        // Tampilkan gaji bersih
        System.out.println("Gaji bersih: Rp. " + gajiBersih);
    }
}
