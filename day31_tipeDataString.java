import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
       boolean berhasil = false;
       String username, password, dbUsername, dbPassword;
       dbUsername = "madina";
       dbPassword = "masukmi";
       
       while(!berhasil){
           Scanner sc = new Scanner (System.in);
           System.out.println("INPUT");
           System.out.print("Masukkan nama: ");
           username = sc.nextLine();
           System.out.print("Password:");
           password = sc.nextLine();
           
           System.out.println("OUTPUT");
       if (username.equals(dbUsername)&& password.equals(dbPassword)){
           berhasil = true;
           System.out.println("login berhasil");
       }else{
           System.out.println("login gagal");
           System.out.println("coba lagi");
       }
       }
      
       
    }
    
}
