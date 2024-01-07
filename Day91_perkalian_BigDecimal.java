
import java.math.BigDecimal;

public class perkalian_BigDecimal {
    public static void main(String[] args) {
        BigDecimal ka= new BigDecimal("888888888888888888888888888888888.999999999999999999999999");
        BigDecimal li= new BigDecimal("444444444444444444444444444444444.555555555555555555555555");
        
        BigDecimal kali=ka.multiply(li);
        
        System.out.println("hasil perkalian BigDecimal: "+kali);
    }
}
