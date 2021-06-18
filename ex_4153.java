import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            x=(int)Math.pow(x,2);
            int y = sc.nextInt();
            y=(int)Math.pow(y,2);
            int z = sc.nextInt();
            z=(int)Math.pow(z,2);


            if(x==0 && y==0 && z==0) break;
         
            if(x+y==z){
                System.out.println("right");
            } 
            else if(y+z==x){
                System.out.println("right");
            }
            else if(x+z==y){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        
        }
    }
}