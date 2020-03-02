package APP1;

public class problem7{
    public static int factorPrim(int n){
      int d = 2;
        while(n!=1){
            int p = 0;
            while(n%d ==0){
                n/=d;
                p++;
            }
            d++;
      }
        return d - 1;
 }
    
 public static void main(String []args){
        System.out.println(factorPrim(15));
    }
}