import java.util.Scanner;//untuk membaca input dari pengguna.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//baris ini membuat objek Scanner baru dengan nama input.
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();//baris ini membaca input dari pengguna dan menyimpannya dalam variabel angka.
        
        if (angka > 0) {//baris ini memulai blok kondisi if. Jika angka lebih besar dari 0, maka program akan menjalankan statement yang berada dalam blok if.
            System.out.println("Angka yang dimasukkan adalah bilangan positif");
        
        } else if (angka < 0) {//baris ini memulai blok kondisi else if. Jika angka kurang dari 0, maka program akan menjalankan statement yang berada dalam blok else if.
            System.out.println("Angka yang dimasukkan adalah bilangan negatif");
        
        } else {//baris ini memulai blok kondisi else. Jika kedua kondisi sebelumnya tidak terpenuhi, maka program akan menjalankan statement yang berada dalam blok else.
            System.out.println("Angka yang dimasukkan adalah nol");
        }
    }
}
