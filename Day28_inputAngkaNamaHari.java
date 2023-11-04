import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = input.nextInt();
        
        if (nomorHari == 1) {
            System.out.println("Hari ini adalah hari Minggu");
        } else if (nomorHari == 2) {
            System.out.println("Hari ini adalah hari Senin");
        } else if (nomorHari == 3) {
            System.out.println("Hari ini adalah hari Selasa");
        } else if (nomorHari == 4) {
            System.out.println("Hari ini adalah hari Rabu");
        } else if (nomorHari == 5) {
            System.out.println("Hari ini adalah hari Kamis");
        } else if (nomorHari == 6) {
            System.out.println("Hari ini adalah hari Jumat");
        } else if (nomorHari == 7) {
            System.out.println("Hari ini adalah hari Sabtu");
        } else {
            System.out.println("Nomor hari yang dimasukkan tidak valid");
        }
    }
}
