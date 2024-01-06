
import java.util.Scanner;


public class konstanta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai konstanta: ");//membaca nilai konstanta
        int konstanta = sc.nextInt();
        int hasil = konstanta*2;//menghitung nilai konstanta
        System.out.println("Hasil perhitungan: "+ hasil);//menampilkan hasil
    }
}
