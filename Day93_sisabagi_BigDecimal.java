 
package fileaa;

import java.math.BigDecimal;


public class sisabagi_BigDecimal {
    public static void main(String[] args) {
        String nilai1 ="222222222222222222222.11111111111111111111111111";
        String nilai2 ="111111111111111111111.0000000000000000000000000";
        
        BigDecimal sisa= new BigDecimal(nilai1);
        BigDecimal bagi= new BigDecimal(nilai2);
        
        BigDecimal sisa_bagi=sisa.remainder(bagi);
        
        System.out.println("hasil sisabagi dari nilai pertama dand kedua adalah: "+sisa_bagi);
    }
}
