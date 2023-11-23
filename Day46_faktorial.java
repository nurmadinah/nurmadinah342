import java.util.Scanner;


public class Day46 {

    
    public static void main(String[] args) {
     Scanner Sc = new Scanner (System.in);
        System.out.println("masukkan nilai: ");
        int nilai = Sc.nextInt();
        
        int faktorial = 1;
        for(int i = 1; i <= nilai; i++){
            faktorial *=i;
        }
        System.out.println("hasil faktorial dari " +nilai+ " adalah "+ faktorial);      
    }
    
}
