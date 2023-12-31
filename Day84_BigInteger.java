
import java.math.BigInteger;


public class day83nonprimitif_perkalian_BigInteger {
    public static void main(String[] args) {
        BigInteger ka=new BigInteger("456849695049568904680956849568909568095685096859");
        BigInteger li=new BigInteger("298564958646745986749856749856749674506849867498");
        
        BigInteger kali=ka.multiply(li);
        
        System.out.println("hasil perkalian BigInteger: "+kali);
    }
}
