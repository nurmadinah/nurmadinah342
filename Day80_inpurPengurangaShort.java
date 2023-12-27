



import java.util.Scanner;

public class Scanner_pengurangan_short {

    public static void main(String[] args) {

        short a,b;

        Scanner ar = new Scanner(System.in);

        System.out.print("masukkan nilai A : ");

        a = ar.nextShort();

        System.out.print("masukkan nilai B : ");

        b = ar.nextShort();

        System.out.println("hasil = "+(a-b));

    }

    

}
