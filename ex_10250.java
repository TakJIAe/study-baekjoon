import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X,Y;
        int T = sc.nextInt();

        for(int i=0; i<T; i++){

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if( N % H == 0 ){
                Y = H * 100;
                X = N / H;

                System.out.println(Y+X);
            }
            else{
                Y = (N % H) * 100;
                X = (N/H) + 1;

                System.out.println(Y+X);
            }
        }   
    }
}