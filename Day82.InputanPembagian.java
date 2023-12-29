
import java.util.Scanner;

public class Scanner_pembagian_integer {

    public static void main(String[] args) {

        int a, b;

        Scanner ar = new Scanner(System.in);

        System.out.print("masukkan nilai A : ");

        a = ar.nextShort();

        System.out.print("masukkan nilai B : ");

        b = ar.nextShort();

        System.out.println("hasil = " + (a / b));

    }



}
