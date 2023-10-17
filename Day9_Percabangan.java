
import java.util.Scanner;


public class percabagan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai:");
        int nilai=sc.nextInt();
        
        if(nilai<70){
            System.out.println("Mengulang");
        }else{
            System.out.println("Lolos");
        }
    }
}
