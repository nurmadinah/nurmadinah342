import java.util.Scanner;

public class day38 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int bilangan;

        // Input bilangan
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan bilangan: ");
            bilangan = input.nextInt();

            // Cek bilangan genap atau ganjil
            if (bilangan % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        } while (true);
    }
}
