import java.util.HashSet;


public class Day25 {

   
    public static void main(String[] args) {
        HashSet bendaUnik = new HashSet();
        //memasukkan data 
        bendaUnik.add("kipas");
        bendaUnik.add("tas");
        bendaUnik.add("dompet");
        bendaUnik.add("botol");
        bendaUnik.add("buku");
        
        //memasukkan data yang sama dengan data sebelumnya
        bendaUnik.add("dompet");
        bendaUnik.add("botol");
        bendaUnik.add("buku");
        
        //mehhapus item yg ada
        bendaUnik.remove("botol");
        
        System.out.println(bendaUnik);
    }

    }
    
