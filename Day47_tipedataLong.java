public class days47 {
    public static void main(String[] args) {
      long[] data = {2,9,7,3,8};//mendeklarasikan variabel
        long max = data [0];
        long min = data [0];
        
        for (long i : data){
            if (i > max ){ 
                max = i;
            }
            if(i < min){
                min = i;   
            }
        }
        System.out.println("nilai maxisimunnya adalah : "+max);
        System.out.println("nilai minimumnya adalah : "+min);
        
    } 
}
