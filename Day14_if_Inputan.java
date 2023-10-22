
package fileaa;

import java.util.Scanner;


public class if_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan[do,re,mi,fa,sol,la,si,DO]: ");
        String masukan_user = sc.nextLine();
        String a = "do";
        String b = "re";
        String c = "mi";
        String d = "fa";
        String e = "sol";
        String f = "la";
        String g = "si";
        String h = "Do";
        
        if(masukan_user.equals(a)){
            System.out.println("Doakan 'ku harus pergi");
        }else if(masukan_user.equals(b)){
            System.out.println("Relakan aku disini");
        }else if(masukan_user.equals(c)){
            System.out.println("Misalnya aku 'kan pulang");
        }else if(masukan_user.equals(d)){
            System.out.println("Fastikan kau tetap menunggu");
        }else if(masukan_user.equals(e)){
            System.out.println("Soal cinta luar biasa");
        }else if(masukan_user.equals(f)){
            System.out.println("Lama-lama bisa gila");
        }else if(masukan_user.equals(g)){
            System.out.println("Siapa yang tau pasti");
        }else if(masukan_user.equals(h)){
            System.out.println("Doakan aku disini");
        }else{
            System.out.println("oii salah ketik bambang");
        }
        
    }
}
