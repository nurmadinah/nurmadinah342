import java.util.Scanner;

public class latihan2 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int luasTanah;
        int hargaJualPerMeter;
        int totalHargaJual;
        int pajak;
        int uangBersih;

        // Input luas tanah
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan luas tanah (dalam meter persegi): ");
        luasTanah = input.nextInt();

        // Hitung total harga jual
        hargaJualPerMeter = 300000;
        totalHargaJual = luasTanah * hargaJualPerMeter;

        // Hitung pajak
        if (totalHargaJual >= 100000000) {
            pajak = 5 / 100 * totalHargaJual;
        } else if (totalHargaJual >= 50000000) {
            pajak = 3 / 100 * totalHargaJual;
        } else {
            pajak = 1 / 100 * totalHargaJual;
        }

        // Hitung uang bersih
        uangBersih = totalHargaJual - pajak;

        // Tampilkan uang bersih
        System.out.println("Uang bersih hasil penjualan tanah: Rp. " + uangBersih);
    }
}
