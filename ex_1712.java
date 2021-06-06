import java.util.Scanner;

class Main{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       sc.close();
       
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
    
       if(C<=B){
           System.out.println(-1);
        }
        else{
            System.out.println(A/(C-B)+1);
        }
   }
}