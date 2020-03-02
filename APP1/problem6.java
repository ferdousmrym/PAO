package APP1;
import java.util.Scanner;

 public class problem6{
  public static void main(String [] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("n:");
     int n = scanner.nextInt();
     
     int x=1, y=4, z=0;
     
    if(n==1|| n==2){
         System.out.print("%");
        }
       
     while((x+y)<=n){
         z=x+y;
         x=y; 
         y=z;
    }
    System.out.println(z);
 }
}
 