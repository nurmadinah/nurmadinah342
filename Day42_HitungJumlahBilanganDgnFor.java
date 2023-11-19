import java.util.Scanner;

public class latihan8 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int batasAtas;
        int jumlahBilangan;

        // Input batas atas
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        batasAtas = input.nextInt();

        // Hitung jumlah bilangan
        jumlahBilangan = 0;
        for (int i = 1; i <= batasAtas; i++) {
            if (i % 3 == 0) {
                jumlahBilangan++;
            }
        }

        // Tampilkan hasil
        System.out.println("Jumlah bilangan yang habis dibagi 3: " + jumlahBilangan);
    }
}
