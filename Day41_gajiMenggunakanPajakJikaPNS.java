import java.util.Scanner;

public class latihan7 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int penghasilan;
        String jenisPekerjaan;
        float pajak;
        float penghasilanBersih;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan penghasilan: ");
        penghasilan = input.nextInt();
        System.out.print("Masukkan jenis pekerjaan: ");
        jenisPekerjaan = input.next();

        // Hitung pajak
        if (penghasilan >= 3000000) {
            pajak = 0.05f * penghasilan;
        } else if (penghasilan >= 5000000) {
            pajak = 0.1f * penghasilan;
        } else {
            pajak = 0;
        }

        // Hitung penghasilan bersih
        if (jenisPekerjaan.equals("PNS")) {
            pajak += 0.05f * pajak;
        }
        penghasilanBersih = penghasilan - pajak;

        // Tampilkan hasil
        System.out.println("Penghasilan bersih: Rp. " + penghasilanBersih);
    }
}
