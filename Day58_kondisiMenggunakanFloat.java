import java.util.Scanner;


public class kondisi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //meminta input nilai dari user
        System.out.println("masukkan nilai: ");
        float nilai = input.nextFloat();
        
        if (nilai > 50){
            System.out.println("nilai lebih besar dari 50");
            
        }else if (nilai == 50){
            System.out.println("nilai sama dengan 50");
            
        }else{
            System.out.println("nilai kurang dari 50");
        }
       
    }
}
