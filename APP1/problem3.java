package APP1;
import java.util.Scanner;

public class problem3{
 public static void main(String [] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("n:");
     int n= scanner.nextInt();
     
     int i=1;
     int sum = 0; 
     while(i<=n){
        if(i*3 <= n){
             sum= sum+(1*3);
            }
            
        if(i*5 <= n){
             sum= sum+1*5;
            }
        i++;
    }
    System.out.println(sum);
 }
}