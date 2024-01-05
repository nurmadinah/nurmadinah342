
import java.math.BigDecimal;


public class pengurangan_BigDecimal {
    public static void main(String[] args) {
        String kur="555555555555555555555555555555.66666666666666666666666666666";
        String ang="222222222222222222222222222222.33333333333333333333333333333";
        
        BigDecimal angka1= new BigDecimal(kur);
        BigDecimal angka2= new BigDecimal(ang);
        
        BigDecimal kurang=angka1.subtract(angka2);
        
        System.out.println("hasil pengurangan Bigdecimal: "+kurang);
    }
    
}
