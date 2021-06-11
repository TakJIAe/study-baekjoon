import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int cross= 1;
        int sum = 0;

        while(true){
            sum += cross;
            if(X <= sum){
                int a = cross - (sum - X);
                int b = cross + 1 - a;
                
                if(cross %2 ==0){
                    System.out.println(a+"/" + b);
                }
                else{
                    System.out.println(b+"/"+a);
                }
                break;
            }
            cross++;
        }
    }
}
