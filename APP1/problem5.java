package APP1;
import java.util.Scanner;

public class problem5{
  public static void main(String [] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("n:");
     int n = scanner.nextInt();
     boolean ok = true;
     
    for(int d=2; d <=n; d++){
         if (n%d==0){
             ok=false;
             break;
            }
        }
        
     if (ok == true){
        System.out.print("its first");
    }else{
        System.out.print("its not first");
    }
  } 
}