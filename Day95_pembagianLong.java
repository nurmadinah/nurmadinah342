
import java.util.Scanner;


public class PembagianLong {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    long a,b; // 
    long hasil;
     
    System.out.println("masukan bilangan pertama: ");
        a = sc.nextLong();
    System.out.println("masukkan bilangan kedua: ");
        b = sc.nextLong();
    hasil = a / b;
    System.out.println("Hasil pembagiannya adalah: "+hasil);
    }
            
}
