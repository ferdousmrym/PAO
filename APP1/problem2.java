package APP1;

import java.util.Scanner;

   public class problem2{
   public static void main(String [] args)   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("first Integer");
     int M = scanner.nextInt();
     System.out.println(M);
     
     System.out.print("Second Integer");
     int N = scanner.nextInt();
     //int y = scanner.nextInt();
     System.out.println(N);
     
     if (M==N){
         System.out.println("=");
        }else if (M<=N){
            System.out.println(M +" <= " + N);
        }else if (M>=N){
            System.out.println(M +" >= " + N);
        }
    }
}