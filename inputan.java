import java.util.Scanner;



public class Day6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");

        String nama = sc.nextLine();

        System.out.println("Masukkan Alamat: ");

        String alamat = sc.nextLine();

        System.out.println("Jenis Kelamin: ");

        String jk = sc.nextLine();

        System.out.println("Masukkan Umur: ");

        int umur = sc.nextInt();

        System.out.println("Masukkan Tinggi Badan: ");

        double tinggi = sc.nextDouble();

        System.out.println("Masukkan Berat Badan: ");

        double berat = sc.nextDouble();
        

        System.out.println(" BIODATA SAYA ");

        System.out.println("Nama : "+nama);

        System.out.println("Alamat : "+alamat);

        System.out.println("Jenis Kelamin : "+jk);

        System.out.println("Umur : "+umur+" Tahun");

        System.out.println("Tinggi : "+tinggi+ " cm");

        System.out.println("Berat : "+berat+ " kg");

        System.out.println("------------------------------");

       

    }

    

}
